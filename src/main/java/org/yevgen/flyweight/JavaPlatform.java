package org.yevgen.flyweight;

public class JavaPlatform implements Platform {

    public JavaPlatform() {
        System.out.println("Java platform init...");
    }

    @Override
    public void execute(Code code) {
        System.out.println("Compiling and executing Java code");
    }
}
