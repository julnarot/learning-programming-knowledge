package com.julnarot.learning.operators.filtering;

import com.julnarot.learning.models.Shape;
import com.julnarot.learning.observables.FlowableWithBackpressure;
import com.julnarot.learning.observer.DemoObserver;
import com.julnarot.learning.util.RxUtils;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.observables.GroupedObservable;
import io.reactivex.schedulers.Schedulers;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GroupByOperator {
    private static final Logger logger = LoggerFactory.getLogger(FlowableWithBackpressure.class);

    public static void main(String... args) {
        Observable.fromIterable(RxUtils.shapes(20))
                .groupBy(new Function<Shape, Object>() {
                    @Override
                    public Object apply(Shape shape) throws Exception {
                        return shape.getShape();
                    }
                })
                .observeOn(Schedulers.newThread())
                .subscribe(new Observer<GroupedObservable<Object, Shape>>() {
                    @Override
                    public void onSubscribe(@NotNull Disposable disposable) {

                    }

                    @Override
                    public void onNext(@NotNull GroupedObservable<Object, Shape> objectShapeGroupedObservable) {
                        logger.info("KEY {}", objectShapeGroupedObservable.getKey());
                        objectShapeGroupedObservable.subscribe(new DemoObserver());
                    }

                    @Override
                    public void onError(@NotNull Throwable throwable) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
        RxUtils.sleep(10000);
    }
}
