package com.julnarot.learning.operators.filtering;

import com.julnarot.learning.observer.DemoObserver;
import com.julnarot.learning.util.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SkipLastOperator {
    private static final Logger logger = LoggerFactory.getLogger(SkipeOperator.class);

    public static void main(String[] args) {
        logger.info("take  Operator");
        Observable.fromIterable(RxUtils.postiveNumbers(10))
                .take(5) // gettin only 2 elemets
                .subscribe(new DemoObserver());

    }
}
