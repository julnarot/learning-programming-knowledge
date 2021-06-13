package com.julnarot.learning.observables;

import com.julnarot.learning.observer.DemoObserver;
import com.julnarot.learning.util.RxUtils;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class ObservableUsingInterval {
    public static void main(String... args) {
        Observable.interval(1, TimeUnit.SECONDS)
                .subscribe(new DemoObserver());
        RxUtils.sleep(3000);
    }
}
