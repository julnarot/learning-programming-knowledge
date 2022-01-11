package com.julnarot.learning.operators.filtering;

import com.julnarot.learning.observer.DemoObserver;
import com.julnarot.learning.util.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BufferOperator {
    private static final Logger LOGGER = LoggerFactory.getLogger(BufferOperator.class);

    public static void main(String... args) {
        Observable.fromIterable(RxUtils.shapes(10))
                .buffer(3)
                .subscribe(new DemoObserver());
    }
}
