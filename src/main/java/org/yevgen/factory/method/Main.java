package org.yevgen.factory.method;

public class Main {

    /*
    Use the Factory Method pattern when
    • A class can’t anticipate the class of objects it must create.
    • A class wants its subclasses to specify the objects it creates.
    • Classes delegate responsibility to one of several helper subclasses, and you want to localize the knowledge of which helper
    subclass is the delegate.
     */
    public static void main(String[] args) {
       Form form = new DesktopForm();
       form.render();

       form = new WebForm();
       form.render();
    }
}
