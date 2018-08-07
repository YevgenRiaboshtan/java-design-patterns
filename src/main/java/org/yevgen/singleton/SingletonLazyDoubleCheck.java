package org.yevgen.singleton;

import java.util.Random;

public class SingletonLazyDoubleCheck {
    private static SingletonLazyDoubleCheck instance;

    private Random random;

    private SingletonLazyDoubleCheck() {
        System.out.println("SingletonLazyDoubleCheck complex init process");
        random = new Random();
    }

    public static SingletonLazyDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingletonLazyDoubleCheck.class) {
                if (instance == null) {
                    instance = new SingletonLazyDoubleCheck();
                }
            }
        }
        return instance;
    }

    public int getNumber() {
        return random.nextInt();
    }
}