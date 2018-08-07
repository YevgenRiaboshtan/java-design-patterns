package org.yevgen.singleton;

public class Main {

    public static void main(String... args) {

        System.out.println("Start");
        print(SingletonEager.getInstance().getNumber());
        print(SingletonLazy.getInstance().getNumber());
        print(SingletonLazyDoubleCheck.getInstance().getNumber());
        print(SingletonLazyMultithreaded.getInstance().getNumber());
        print(SingletonEnum.INSTANCE.getNumber());
        print(SingletonReflection.getInstance().getNumber());
    }

    private static void print(int value) {
        System.out.println("Print " + value);
    }
}
