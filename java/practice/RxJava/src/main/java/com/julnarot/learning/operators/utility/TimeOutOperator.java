package com.julnarot.learning.operators.utility;

import com.julnarot.learning.observer.DemoObserver;
import com.julnarot.learning.util.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class TimeOutOperator {
    private static final Logger logger = LoggerFactory.getLogger(TimeOutOperator.class);

    public static void main(String[] args) {
        logger.info("TimeOut Operator");
        Observable.timer(2, TimeUnit.SECONDS)
                .timeout(1, TimeUnit.SECONDS)
                .subscribe(new DemoObserver());
        RxUtils.sleep(3000);
    }
}
