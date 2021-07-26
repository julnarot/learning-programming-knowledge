package com.julnarot.learning.operators.filtering;

import com.julnarot.learning.observables.FlowableWithBackpressure;
import com.julnarot.learning.observer.DemoObserver;
import com.julnarot.learning.util.RxUtils;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class DebounceOperator {
    private static final Logger logger = LoggerFactory.getLogger(DebounceOperator.class);
    private static List<Character> changeIt = new ArrayList<>();

    public static void main(String[]  args) {
        logger.info("Debounce  Operator");

        Random r = new Random();
        Observable.interval(2, TimeUnit.SECONDS)
                .map(c -> {
                    changeIt.add((char) (r.nextInt(26) + 'a'));
                    return changeIt;
                }).doOnEach
                (notification -> { logger.info("Current value -> {}", notification.getValue());
        })
                .debounce(2, TimeUnit.SECONDS)
                .subscribeOn(Schedulers.newThread())
                .observeOn(Schedulers.newThread())
                .subscribe(new DemoObserver());

        RxUtils.sleep(10000);

    }
}
