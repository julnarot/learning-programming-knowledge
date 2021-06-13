package com.julnarot.learning.operators.utility;

import com.julnarot.learning.observer.DemoObserver;
import com.julnarot.learning.util.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class TakeUntilOperator {
    private static final Logger logger = LoggerFactory.getLogger(TakeUntilOperator.class);

    public static void main(String[] args) {
        logger.info("TakeUntil Operator");

        Observable singleSecond = Observable.interval(1, TimeUnit.SECONDS);
        Observable fiveSecond = Observable.interval(5, TimeUnit.SECONDS);
        singleSecond.takeUntil(fiveSecond)
                .subscribe(new DemoObserver());
        RxUtils.sleep(15000);

    }
}
