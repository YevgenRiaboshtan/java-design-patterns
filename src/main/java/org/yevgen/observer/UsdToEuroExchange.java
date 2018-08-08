package org.yevgen.observer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class UsdToEuroExchange implements Subject, Exchange {

    private String message;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribeObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unSubscribeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.applyEvent(message));
    }

    @Override
    public void setExchangeRate(BigDecimal rate) {
        if (rate != null) {
            this.message = "USD to EURO rate is " + rate;
            notifyObservers();
        }
    }
}
