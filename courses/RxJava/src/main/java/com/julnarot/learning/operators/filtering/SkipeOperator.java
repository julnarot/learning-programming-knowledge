package com.julnarot.learning.operators.filtering;

import com.julnarot.learning.observer.DemoObserver;
import com.julnarot.learning.util.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class SkipeOperator {
    private static final Logger logger = LoggerFactory.getLogger(SkipeOperator.class);
    private static List<Character> changeIt = new ArrayList<>();

    public static void main(String[] args) {
        logger.info("Skip  Operator");
        Observable.fromIterable(RxUtils.postiveNumbers(10))
                .skip(6)
                .subscribe(new DemoObserver());

    }
}
