package com.julnarot.learning.observables;

import com.julnarot.learning.util.RxUtils;
import io.reactivex.Flowable;
import io.reactivex.schedulers.Schedulers;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicInteger;

public class FlowableWithBackpressure {

    private static final Logger logger = LoggerFactory.getLogger(FlowableWithBackpressure.class);

    public static void main(String... args) {
        Flowable<Integer> flowablePositiveNumbers = Flowable.fromIterable(RxUtils.postiveNumbers(1000000))
                .repeat()
                .observeOn(Schedulers.newThread(), false, 5)
                .subscribeOn(Schedulers.newThread())
                .doOnNext(integer -> logger.info("emitting integer ->{}", integer));

        flowablePositiveNumbers.subscribe(new Subscriber<Integer>() {
            private Subscription subscription;
            private AtomicInteger counter = new AtomicInteger(0);

            @Override
            public void onSubscribe(Subscription subscription) {
                logger.info("On Subscribe");
                this.subscription = subscription;
                subscription.request(5);
            }

            @Override
            public void onNext(Integer integer) {
                logger.info("On Next -> {}", integer);
                RxUtils.sleep(100L);
                if (counter.incrementAndGet() % 5 == 0) {
                    subscription.request(5);
                }
            }

            @Override
            public void onError(Throwable throwable) {
                logger.info("On Error {}", throwable.getMessage());
            }

            @Override
            public void onComplete() {
                logger.info("On Complete...");
            }
        });
        RxUtils.sleep(10000);
    }
}
