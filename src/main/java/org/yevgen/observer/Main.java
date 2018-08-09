package org.yevgen.observer;

import java.math.BigDecimal;

public class Main {

    /*
    Use the Observer pattern in any of the following situations:
    • When an abstraction has two aspects, one dependent on the other. Encapsulating these aspects in separate objects lets you vary
    and reuse them independently.
    • When a change to one object requires changing others, and you don’t know how many objects need to be changed.
    • When an object should be able to notify other objects without making assumptions about who these objects are. In other words,
    you don’t want these objects tightly coupled.
     */
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
