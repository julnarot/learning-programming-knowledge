package com.julnarot.learning.operators.filtering;

import com.julnarot.learning.observer.DemoObserver;
import com.julnarot.learning.util.RxUtils;
import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class ElementAtOperator {
    private static final Logger logger = LoggerFactory.getLogger(DistictOperator.class);
    private static List<Character> changeIt = new ArrayList<>();

    public static void main(String[] args) {
        logger.info("Distinct  Operator");
        Observable.fromIterable(RxUtils.postiveNumbers(10))
                .elementAt(6)
                .subscribe(new MaybeObserver<Integer>() {
                    @Override
                    public void onSubscribe(@NotNull Disposable disposable) {
                        logger.info("OnSubscribe");
                    }

                    @Override
                    public void onSuccess(@NotNull Integer integer) {
                        logger.info("Success -> {}", integer);
                    }

                    @Override
                    public void onError(@NotNull Throwable throwable) {
                        logger.info("on Error -> {}", throwable.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        logger.info("Complete!");
                    }
                });

    }
}
