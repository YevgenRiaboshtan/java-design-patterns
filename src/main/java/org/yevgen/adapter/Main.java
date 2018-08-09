package org.yevgen.adapter;

import java.util.UUID;

public class Main {
    /*
    When to use Adapter Pattern
    The Adapter pattern should be used when:
    • There is an existing class, and its interface does not match the one you need.
    • You want to create a reusable class that cooperates with unrelated or unforeseen classes, that is, classes that don’t necessarily
    have compatible interfaces.
    • There are several existing subclasses to be use, but it’s impractical to adapt their interface by subclassing every one. An object
    adapter can adapt the interface of its parent class.
     */
    public static void main(String[] args) {
        final Laptop laptop = new Laptop();

        laptop.connect(new FlashDrive());
        System.out.println(laptop.readInfo());
        laptop.writeInfo(UUID.randomUUID().toString());
        System.out.println(laptop.readInfo());

        laptop.connect(new SataToUsbAdapter(new SataHDD()));
        System.out.println(laptop.readInfo());
        laptop.writeInfo(UUID.randomUUID().toString());
        System.out.println(laptop.readInfo());
    }
}
