package com.julnarot.learning.observables;

import com.julnarot.learning.observer.DemoObserver;
import com.julnarot.learning.util.RxUtils;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ObservableWithoutBackPressure {
    private static final Logger logger = LoggerFactory.getLogger(ObservableWithoutBackPressure.class);

    public static void main(String... a) {

        Observable<Integer> positiveNumber = Observable.fromIterable(RxUtils.postiveNumbers(1000000))
                .repeat()
                .observeOn(Schedulers.newThread())
                .subscribeOn(Schedulers.newThread());
        positiveNumber.subscribe(new DemoObserver());
        RxUtils.sleep(10000);
    }
}
