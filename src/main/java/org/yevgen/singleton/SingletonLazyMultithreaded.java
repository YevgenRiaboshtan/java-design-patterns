package org.yevgen.singleton;

import java.util.Random;

public class SingletonLazyMultithreaded {
    private static SingletonLazyMultithreaded instance;

    private Random random;

    private SingletonLazyMultithreaded() {
        System.out.println("SingletonLazyMultithreaded complex init process");
        random = new Random();
    }

    public synchronized static SingletonLazyMultithreaded getInstance() {
        if (instance == null) {
            instance = new SingletonLazyMultithreaded();
        }
        return instance;
    }

    public int getNumber() {
        return random.nextInt();
    }
}