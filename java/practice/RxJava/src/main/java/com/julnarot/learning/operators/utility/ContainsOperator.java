package com.julnarot.learning.operators.utility;

import com.julnarot.learning.util.RxUtils;
import io.reactivex.Observable;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContainsOperator {
    private static final Logger logger = LoggerFactory.getLogger(ContainsOperator.class);

    public static void main(String[] args) {
        logger.info("Contains Operator");

        Observable<Integer> positiveNumber = Observable.fromIterable(RxUtils.postiveNumbers(10));

        positiveNumber.contains(10) // if exist number in postive numbers
                .subscribe(new SingleObserver<Boolean>() {
                    @Override
                    public void onSubscribe(@NotNull Disposable disposable) {

                    }

                    @Override
                    public void onSuccess(@NotNull Boolean result) {
                        logger.info("Element present {}", result);
                    }

                    @Override
                    public void onError(@NotNull Throwable throwable) {

                    }
                });
    }
}
