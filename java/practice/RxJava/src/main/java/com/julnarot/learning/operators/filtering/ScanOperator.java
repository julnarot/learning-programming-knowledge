package com.julnarot.learning.operators.filtering;

import com.julnarot.learning.observables.FlowableWithBackpressure;
import com.julnarot.learning.observer.DemoObserver;
import com.julnarot.learning.util.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ScanOperator {
    private static final Logger logger = LoggerFactory.getLogger(FlowableWithBackpressure.class);

    public static void main(String... args) {
        logger.info("Scan  Operator");
        List<Integer> numbers = RxUtils.postiveNumbers(10);
        Observable.fromIterable(numbers)
                .scan((integer, integer2) -> {
                    return integer + integer2;
                }).subscribe(new DemoObserver());
    }
}
