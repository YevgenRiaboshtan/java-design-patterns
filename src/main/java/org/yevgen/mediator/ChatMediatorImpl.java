package org.yevgen.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

    private final List<UserColleague> users = new ArrayList<>();

    @Override
    public void addUser(UserColleague userColleague) {
        users.add(userColleague);
    }

    @Override
    public void sendMessage(String msg, UserColleague userColleague) {
        users.forEach(user -> {
            if (!user.equals(userColleague)) {
                user.receiveMessage(msg);
            }
        });
    }
}
