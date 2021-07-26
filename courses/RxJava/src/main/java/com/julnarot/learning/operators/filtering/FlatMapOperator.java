package com.julnarot.learning.operators.filtering;

import com.julnarot.learning.observables.FlowableWithBackpressure;
import com.julnarot.learning.observer.DemoObserver;
import com.julnarot.learning.util.RxUtils;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class FlatMapOperator {
    private static final Logger logger = LoggerFactory.getLogger(FlowableWithBackpressure.class);

    public static void main(String... args) {
        logger.info("Flap MAp Operator");
        List<Integer> positiveIntegers = RxUtils.postiveNumbers(10);
        Observable.fromIterable(positiveIntegers)
                .flatMap(integer -> {
                    return twice(integer);
                }).subscribe(new DemoObserver());
    }

    public static Observable<Integer> twice(Integer integer) {
        return Observable.create(observableEmitter -> {
            if (!observableEmitter.isDisposed()) {
                observableEmitter.onNext(integer * 2);
            } else {
                observableEmitter.onComplete();
            }
        });
    }
}
