package com.julnarot.learning.operators.filtering;

import com.julnarot.learning.observer.DemoObserver;
import com.julnarot.learning.util.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MergeOperator {
    private static final Logger logger = LoggerFactory.getLogger(MergeOperator.class);

    public static void main(String[] args) {
        logger.info("Merge  Operator");
        Observable observable = Observable.fromIterable(RxUtils.shapes(5));
        Observable observable1 = Observable.fromIterable(RxUtils.postiveNumbers(5));

        Observable.merge(observable, observable1)
                .subscribe(new DemoObserver());
    }
}
