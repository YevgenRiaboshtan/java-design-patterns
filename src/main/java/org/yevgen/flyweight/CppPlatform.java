package org.yevgen.flyweight;

public class CppPlatform implements Platform {

    public CppPlatform() {
        System.out.println("Cpp platform init...");
    }

    @Override
    public void execute(Code code) {
        System.out.println("Compiling and executing Cpp code");
    }
}
