package com.julnarot.learning.operators.filtering;

import com.julnarot.learning.observables.FlowableWithBackpressure;
import com.julnarot.learning.observer.DemoObserver;
import com.julnarot.learning.util.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MapOperator {
    private static final Logger logger = LoggerFactory.getLogger(FlowableWithBackpressure.class);

    public static void main(String... args) {
        Observable.fromIterable(RxUtils.postiveNumbers(10))
                .map(integer -> {
                    return integer * 2;
                })
                .subscribe(new DemoObserver());
    }
}
