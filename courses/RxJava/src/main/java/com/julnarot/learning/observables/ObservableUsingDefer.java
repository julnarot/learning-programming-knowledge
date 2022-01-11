package com.julnarot.learning.observables;

import com.julnarot.learning.observer.DemoObserver;
import com.julnarot.learning.util.RxUtils;
import io.reactivex.Observable;

public class ObservableUsingDefer {

    public static void main(String... args) {

        Observable<Integer> observableUsingDefer = Observable.defer(() -> {
            return Observable.fromIterable(RxUtils.postiveNumbers(5));
        });

        observableUsingDefer.subscribe(new DemoObserver());
    }
}
