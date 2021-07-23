package com.julnarot.learning.operators.filtering;

import com.julnarot.learning.observer.DemoObserver;
import com.julnarot.learning.util.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ZipOperator {
    private static final Logger logger = LoggerFactory.getLogger(ZipOperator.class);

    public static void main(String[] args) {
        logger.info("Zip Operator");
        Observable shapes = Observable.fromIterable(RxUtils.shapes(5));
        Observable numbers = Observable.fromIterable(RxUtils.postiveNumbers(3));

        numbers.zipWith(shapes, (o, o2) -> {
            return o.toString() + ": " + o2.toString();
        }).subscribe(new DemoObserver());
    }
}
