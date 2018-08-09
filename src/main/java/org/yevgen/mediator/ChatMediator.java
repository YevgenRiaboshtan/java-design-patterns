package org.yevgen.mediator;

public interface ChatMediator {

    void addUser(UserColleague userColleague);

    void sendMessage(String msg, UserColleague userColleague);
}
