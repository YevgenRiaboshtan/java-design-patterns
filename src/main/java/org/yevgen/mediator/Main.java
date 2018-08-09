package org.yevgen.mediator;

public class Main {
    /*
    When to use the Mediator Pattern
    • A set of objects communicate in well-defined but complex ways. The resulting interdependencies are unstructured and difficult
    to understand.
    • Reusing an object is difficult because it refers to and communicates with many other objects.
    • A behavior that’s distributed between several classes should be customizable without a lot of sub-classing.
     */
    public static void main(String... arg) {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new User(mediator, "Mark");
        User user2 = new User(mediator, "Alex");
        User user3 = new User(mediator, "Anna");
        User user4 = new User(mediator, "Yevgen");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.sendMessage("Hi All");
        user2.sendMessage("Hi");
    }
}
