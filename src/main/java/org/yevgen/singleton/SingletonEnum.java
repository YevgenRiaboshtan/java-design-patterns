package org.yevgen.singleton;

import java.util.Random;

public enum SingletonEnum {

    INSTANCE;

    private static Random random;

    static {
        System.out.println("SingletonEnum complex init process");
        random = new Random();
    }

    public int getNumber() {
        return random.nextInt();
    }
}
