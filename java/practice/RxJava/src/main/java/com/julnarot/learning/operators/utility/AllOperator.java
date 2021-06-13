package com.julnarot.learning.operators.utility;

import com.julnarot.learning.observer.DemoObserver;
import com.julnarot.learning.util.RxUtils;
import io.reactivex.Observable;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AllOperator {
    private static final Logger logger = LoggerFactory.getLogger(AllOperator.class);

    public static void main(String[] args) {
        logger.info("All Operator");
        Observable<Integer> positiveNumber = Observable.fromIterable(RxUtils.postiveNumbers(10));

        positiveNumber.all(
                integer -> integer > 5
        )
                .subscribe(new SingleObserver<Boolean>() {
                    @Override
                    public void onSubscribe(@NotNull Disposable disposable) {

                    }

                    @Override
                    public void onSuccess(@NotNull Boolean result) {
                        logger.info("Do all of the Event are greater than = {}", result );
                    }

                    @Override
                    public void onError(@NotNull Throwable throwable) {

                    }
                });
    }
}
