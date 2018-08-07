package org.yevgen.singleton;

import java.util.Random;

public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    private Random random;

    private SingletonEager() {
        System.out.println("SingletonEager complex init process");
        random = new Random();
    }

    public static SingletonEager getInstance() {
        return instance;
    }

    public int getNumber() {
        return random.nextInt();
    }
}
