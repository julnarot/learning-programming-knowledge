package com.julnarot.learning.operators.filtering;

import com.julnarot.learning.models.Shape;
import com.julnarot.learning.observer.DemoObserver;
import com.julnarot.learning.util.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class FilterOperator {
    private static final Logger logger = LoggerFactory.getLogger(FilterOperator.class);

    public static void main(String[] args) {
        logger.info("Filter  Operator");
        List<Shape> shapes = RxUtils.shapes(10);
        for (Shape s : shapes) {
            logger.info("shapes -> {}", s);
        }

        Observable.fromIterable(shapes)
                .filter(s -> {
                    return s.getColor().equals("blue");
                })
                .subscribe(new DemoObserver());
    }
}
