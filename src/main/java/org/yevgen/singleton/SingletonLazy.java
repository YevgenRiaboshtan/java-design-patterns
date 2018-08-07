package org.yevgen.singleton;

import java.util.Random;

public class SingletonLazy {

    private static SingletonLazy instance;

    private Random random;

    private SingletonLazy() {
        System.out.println("SingletonLazy complex init process");
        random = new Random();
    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

    public int getNumber() {
        return random.nextInt();
    }
}
