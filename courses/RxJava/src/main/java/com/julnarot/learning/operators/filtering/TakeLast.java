package com.julnarot.learning.operators.filtering;

import com.julnarot.learning.observer.DemoObserver;
import com.julnarot.learning.util.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TakeLast {
    private static final Logger logger = LoggerFactory.getLogger(TakeLast.class);

    public static void main(String[] args) {
        logger.info("takeLast  Operator");
        Observable.fromIterable(RxUtils.postiveNumbers(10))
                .takeLast(3)
                .subscribe(new DemoObserver());
    }
}
