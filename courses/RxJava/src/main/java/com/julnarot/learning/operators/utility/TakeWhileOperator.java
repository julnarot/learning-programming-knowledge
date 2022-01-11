package com.julnarot.learning.operators.utility;

import com.julnarot.learning.observer.DemoObserver;
import com.julnarot.learning.util.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TakeWhileOperator {
    private static final Logger logger = LoggerFactory.getLogger(TakeWhileOperator.class);

    public static void main(String[] args) {
        logger.info("TakeWhile Operator");

        Observable<Integer> positiveNumber = Observable.fromIterable(RxUtils.postiveNumbers(10));

        positiveNumber.takeWhile( integer -> {
            return integer<4;
        })
                .subscribe(new DemoObserver());

    }
}
