package com.julnarot.learning.observer;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoObserver implements Observer {
    public static final Logger LOGGER = LoggerFactory.getLogger(Observer.class);


    @Override
    public void onSubscribe(@NotNull Disposable disposable) {
        LOGGER.info("onSubscribe");
    }

    @Override
    public void onNext(@NotNull Object o) {
        LOGGER.info("onNext -> {}", o);
    }

    @Override
    public void onError(@NotNull Throwable throwable) {
        LOGGER.info("onError {}", throwable.getMessage());
    }

    @Override
    public void onComplete() {
        LOGGER.info("onComplete");
    }
}
