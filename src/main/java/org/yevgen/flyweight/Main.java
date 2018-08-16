package org.yevgen.flyweight;

public class Main {

    /*
    The Flyweight pattern’s effectiveness depends heavily on how and where it’s used. Apply the Flyweight pattern when all of the
    following are true:
    • An application uses a large number of objects.
    • Storage costs are high because of the sheer quantity of objects.
    • Most object state can be made extrinsic.
    • Many groups of objects may be replaced by relatively few shared objects once extrinsic state is removed.
    • The application doesn’t depend on object identity. Since flyweight objects may be shared, identity tests will return true for
    conceptually distinct objects.
     */
    public static void main(String[] args) {
        Code code = new Code("Java code");

        Platform platform = PlatformFactory.getPlatformInstance(PlatformFactory.PlatformType.JAVA);
        platform.execute(code);

        code = new Code("Ruby code");
        platform = PlatformFactory.getPlatformInstance(PlatformFactory.PlatformType.RUBY);
        platform.execute(code);

        code = new Code("C code");
        platform = PlatformFactory.getPlatformInstance(PlatformFactory.PlatformType.C);
        platform.execute(code);

        code = new Code("CPP code");
        platform = PlatformFactory.getPlatformInstance(PlatformFactory.PlatformType.CPP);
        platform.execute(code);


        code = new Code("Java code");
        platform = PlatformFactory.getPlatformInstance(PlatformFactory.PlatformType.JAVA);
        platform.execute(code);

        code = new Code("Ruby code");
        platform = PlatformFactory.getPlatformInstance(PlatformFactory.PlatformType.RUBY);
        platform.execute(code);

        code = new Code("C code");
        platform = PlatformFactory.getPlatformInstance(PlatformFactory.PlatformType.C);
        platform.execute(code);

        code = new Code("CPP code");
        platform = PlatformFactory.getPlatformInstance(PlatformFactory.PlatformType.CPP);
        platform.execute(code);
    }
}
