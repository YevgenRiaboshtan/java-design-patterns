package org.yevgen.observer;

public interface Observer {

    void subscribe();

    void unSubscribe();

    void applyEvent(String eventInfo);
}
