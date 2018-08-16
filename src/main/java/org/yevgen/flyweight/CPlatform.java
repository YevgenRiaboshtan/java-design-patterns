package org.yevgen.flyweight;

public class CPlatform implements Platform {

    public CPlatform() {
        System.out.println("C platform init...");
    }

    @Override
    public void execute(Code code) {
        System.out.println("Compiling and executing C code");
    }
}
