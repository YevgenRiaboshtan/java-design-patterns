package org.yevgen.singleton;

import java.io.ObjectStreamException;
import java.util.Random;

public class SingletonReflection {
    private static final long serialVersionUID = -1093810940935189395L;
    private static SingletonReflection sc = new SingletonReflection();

    private Random random;

    private SingletonReflection() {
        if (sc != null) {
            throw new IllegalStateException("Already created.");
        }
        System.out.println("SingletonReflection complex init process");
        random = new Random();
    }

    public static SingletonReflection getInstance() {
        return sc;
    }

    public int getNumber() {
        return random.nextInt();
    }

    private Object readResolve() throws ObjectStreamException {
        return sc;
    }

    private Object writeReplace() throws ObjectStreamException {
        return sc;
    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton, cannot be clonned");
    }

    private static Class getClass(String classname) throws ClassNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (classLoader == null)
            classLoader = SingletonReflection.class.getClassLoader();
        return (classLoader.loadClass(classname));
    }

}
