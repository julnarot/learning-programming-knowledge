package com.julnarot.learning.operators.filtering;

import com.julnarot.learning.observer.DemoObserver;
import com.julnarot.learning.util.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TakeOperator {
    private static final Logger logger = LoggerFactory.getLogger(TakeOperator.class);
    public static void main(String[] args) {
        logger.info("Take  Operator");
        Observable.fromIterable(RxUtils.postiveNumbers(10))
                .take(2)
                .subscribe(new DemoObserver());

    }
}
