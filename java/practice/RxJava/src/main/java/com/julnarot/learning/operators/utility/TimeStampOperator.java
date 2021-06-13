package com.julnarot.learning.operators.utility;

import com.julnarot.learning.observer.DemoObserver;
import com.julnarot.learning.util.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TimeStampOperator {
    private static final Logger logger = LoggerFactory.getLogger(TimeStampOperator.class);

    public static void main(String[] args) {
        logger.info("TimeStamp Operator");
        Observable.fromIterable(RxUtils.shapes(10))
                .timestamp() // wait 2 seconds
                .subscribe(new DemoObserver());
    }
}
