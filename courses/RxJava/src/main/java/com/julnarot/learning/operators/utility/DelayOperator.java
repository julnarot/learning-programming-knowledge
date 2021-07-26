package com.julnarot.learning.operators.utility;

import com.julnarot.learning.observer.DemoObserver;
import com.julnarot.learning.operators.filtering.ZipOperator;
import com.julnarot.learning.util.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class DelayOperator {
    private static final Logger logger = LoggerFactory.getLogger(DelayOperator.class);

    public static void main(String[] args) {
        logger.info("Delay Operator");
        Observable.fromIterable(RxUtils.postiveNumbers(10))
                .delay(2, TimeUnit.SECONDS) // wait 2 seconds
                .subscribe(new DemoObserver());
        RxUtils.sleep(5000);
    }
}
