package com.julnarot.learning.observables;

import com.julnarot.learning.observer.DemoObserver;
import com.julnarot.learning.util.RxUtils;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class ObservableUsingTimer {
    public static void main(String ...args) {
        Observable.timer(5, TimeUnit.SECONDS)
        .subscribe(new DemoObserver());
        RxUtils.sleep(7000);
    }
}
