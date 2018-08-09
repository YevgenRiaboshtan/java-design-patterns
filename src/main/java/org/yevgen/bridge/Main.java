package org.yevgen.bridge;

import org.yevgen.bridge.cars.Bmw;
import org.yevgen.bridge.cars.Mercedes;
import org.yevgen.bridge.colors.Black;
import org.yevgen.bridge.colors.Red;

public class Main {

    /*
    You should use the Bridge Pattern when:
    • You want to avoid a permanent binding between an abstraction and its implementation. This might be the case, for example,
    when the implementation must be selected or switched at run-time.
    • Both the abstractions and their implementations should be extensible by sub-classing. In this case, the Bridge pattern lets you
    combine the different abstractions and implementations and extend them independently.
    • Changes in the implementation of an abstraction should have no impact on clients; that is, their code should not have to be
    recompiled.
    • You want to share an implementation among multiple objects (perhaps using reference counting), and this fact should be hidden
    from the client.
     */
    public static void main(String... args) {
        Car car1 = new Mercedes(new Black());
        Car car2 = new Mercedes(new Red());
        Car car3 = new Bmw(new Black());
        Car car4 = new Bmw(new Red());

        car1.paint();
        car2.paint();
        car3.paint();
        car4.paint();
    }
}
