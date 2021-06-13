package com.julnarot.learning.observables;

import com.julnarot.learning.observer.DemoObserver;
import io.reactivex.Observable;

public class ObservableUsngRange {
    public static void main (String ...args) {
        Observable.range(2, 10)
                .subscribe(new DemoObserver());
    }
}
