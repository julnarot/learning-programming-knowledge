package com.julnarot.learning.operators.utility;

import com.julnarot.learning.observer.DemoObserver;
import com.julnarot.learning.util.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class DoOperator {
    private static final Logger logger = LoggerFactory.getLogger(DoOperator.class);

    public static void main(String[] args) {
        logger.info("Do Operator");
        Observable.fromIterable(RxUtils.shapes(10))
                .doOnSubscribe(disponible -> {
                    logger.info("Stream is Subscribed");
                })
                .doOnEach(shapeNotification -> {
                    logger.info("Current value {}", shapeNotification.getValue());
                })
                .doOnNext(shape -> {
                    logger.info("shape is -> {}", shape);
                })
                .doOnComplete(() -> {
                    logger.info("Stream is Completed");
                }).subscribe( new DemoObserver());
        RxUtils.sleep(5000);
        ;
    }
}
