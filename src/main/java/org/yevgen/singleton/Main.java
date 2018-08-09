package org.yevgen.singleton;

public class Main {

    /*
    When to use Singleton
    • There must be exactly one instance of a class, and it must be accessible to clients from a well-known access point.
    • When the sole instance should be extensible by sub-classing, and clients should be able to use an extended instance without
    modifying their code.
     */
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
