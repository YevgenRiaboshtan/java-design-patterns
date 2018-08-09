package org.yevgen.mediator;

public abstract class UserColleague {

    protected final ChatMediator chatMediator;
    protected final String userName;

    protected UserColleague(ChatMediator chatMediator, String userName) {
        this.chatMediator = chatMediator;
        this.userName = userName;
    }

    public abstract void sendMessage(String msg);

    public abstract void receiveMessage(String msg);
}
