package com.julnarot.learning.observables;

import com.julnarot.learning.observer.DemoObserver;
import io.reactivex.Observable;

import java.util.concurrent.Callable;


public class ObservableUsingCallable {
    public static String doSomething() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello";
    }

    public static void main(String... args) {
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return doSomething();
            }
        };

        Observable.fromCallable(callable)
                .subscribe(new DemoObserver());
    }
}
