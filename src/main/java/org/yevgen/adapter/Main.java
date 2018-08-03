package org.yevgen.adapter;

import java.util.UUID;

public class Main {

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
