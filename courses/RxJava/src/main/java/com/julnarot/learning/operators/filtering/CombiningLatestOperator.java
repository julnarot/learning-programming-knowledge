package com.julnarot.learning.operators.filtering;

import com.julnarot.learning.observer.DemoObserver;
import com.julnarot.learning.util.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class CombiningLatestOperator {
    private static final Logger logger = LoggerFactory.getLogger(CombiningLatestOperator.class);

    public static void main(String[] args) {
        logger.info("CombiningLatest  Operator");
        Observable observable = Observable.interval(1000, TimeUnit.MILLISECONDS);
        Observable observable1 = Observable.interval(2000, TimeUnit.MILLISECONDS);

        Observable.combineLatest(
                observable, observable1, (o, o2) -> {
                    return "first: " + o.toString() + " second " + o2.toString();
                }).take(6)
                .subscribe(new DemoObserver());
        RxUtils.sleep(10000);
    }
}
