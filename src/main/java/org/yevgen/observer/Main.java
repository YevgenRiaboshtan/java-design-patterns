package org.yevgen.observer;

import java.math.BigDecimal;

public class Main {

    public static void main(String ... args) {
        Subject subject = new UsdToEuroExchange();

        Observer observer = new SmsNotification(subject, 123);
        observer.subscribe();

        Observer observer2 = new SmsNotification(subject, 456);
        observer2.subscribe();

        Observer observer3 = new SmsNotification(subject, 789);
        observer3.subscribe();

        Exchange exchange = (Exchange) subject;
        exchange.setExchangeRate(BigDecimal.ZERO);
        observer3.unSubscribe();
        exchange.setExchangeRate(BigDecimal.ONE);
        exchange.setExchangeRate(BigDecimal.TEN);
    }
}
