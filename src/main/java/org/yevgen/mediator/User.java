package org.yevgen.mediator;

public class User extends UserColleague {

    public User(ChatMediator chatMediator, String userName) {
        super(chatMediator, userName);
    }

    @Override
    public void sendMessage(String msg) {
        System.out.println(this.userName + " send message: " + msg);
        chatMediator.sendMessage(msg, this);
    }

    @Override
    public void receiveMessage(String msg) {
        System.out.println(this.userName + " receive message: " + msg);
    }
}
