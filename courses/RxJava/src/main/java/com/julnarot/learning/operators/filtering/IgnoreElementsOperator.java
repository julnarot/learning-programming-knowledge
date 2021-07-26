package com.julnarot.learning.operators.filtering;

import com.julnarot.learning.observer.DemoObserver;
import com.julnarot.learning.util.RxUtils;
import io.reactivex.CompletableObserver;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class IgnoreElementsOperator {
    private static final Logger logger = LoggerFactory.getLogger(IgnoreElementsOperator.class);
    private static List<Character> changeIt = new ArrayList<>();

    public static void main(String[] args) {
        logger.info("Ignore  Operator");
        Observable.fromIterable(RxUtils.primeNumbers(10))
                .ignoreElements()
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(@NotNull Disposable disposable) {
                        logger.info("OnSubscribe");
                    }

                    @Override
                    public void onComplete() {
                        logger.info("OnComplete");
                    }

                    @Override
                    public void onError(@NotNull Throwable throwable) {
                        logger.info("OnError {}", throwable.getMessage());
                    }
                });

    }
}
