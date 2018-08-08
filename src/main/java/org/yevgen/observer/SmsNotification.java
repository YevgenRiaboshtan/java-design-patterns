package org.yevgen.observer;

public class SmsNotification implements Observer {

    private final Subject subject;
    private final int phoneNumber;

    public SmsNotification(Subject subject, int phoneNumber) {
        this.subject = subject;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void subscribe() {
        subject.subscribeObserver(this);
        System.out.println("Subscribed " + phoneNumber + " successfully");
    }

    @Override
    public void unSubscribe() {
        subject.unSubscribeObserver(this);
        System.out.println("Unsubscribed " + phoneNumber + " successfully");
    }

    @Override
    public void applyEvent(String eventInfo) {
        System.out.println("Send: " + eventInfo + " to " + phoneNumber);
    }
}
