package org.yevgen.flyweight;

public class RubyPlatform implements Platform {
    public RubyPlatform() {
        System.out.println("Ruby platform init...");
    }

    @Override
    public void execute(Code code) {
        System.out.println("Compiling and executing Ruby code");
    }
}
