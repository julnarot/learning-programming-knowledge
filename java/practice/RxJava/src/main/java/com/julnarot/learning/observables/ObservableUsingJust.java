package com.julnarot.learning.observables;


import com.julnarot.learning.observer.DemoObserver;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ObservableUsingJust {

    public static final Logger LOGGER = LoggerFactory.getLogger(ObservableUsingJust.class);

    public static void main(String... args) {

        Observable.just('a', 'b', 'c', 'd', 'f', 'g', 'h', 'i', 'j')
                .subscribe(new DemoObserver());
    }
}
