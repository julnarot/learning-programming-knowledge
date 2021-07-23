package com.julnarot.learning.operators.filtering;

import com.julnarot.learning.observer.DemoObserver;
import com.julnarot.learning.util.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class DistictOperator {
    private static final Logger logger = LoggerFactory.getLogger(DistictOperator.class);
    private static List<Character> changeIt = new ArrayList<>();

    public static void main(String[] args) {
        logger.info("Distinct  Operator");
        Observable.just(1, 2, 3, 4, 5, 6)
                .distinct()
                .subscribe(new DemoObserver());

    }
}
