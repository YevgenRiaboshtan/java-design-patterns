package org.yevgen.prototype;

public class Main {

    /*
    Use the Prototype pattern when a system should be independent of how its products are created, composed, and represented; and
    • When the classes to instantiate are specified at run-time, for example, by dynamic loading; or
    • To avoid building a class hierarchy of factories that parallels the class hierarchy of products; or
    • When instances of a class can have one of only a few different combinations of state. It may be more convenient to install a
    corresponding number of prototypes and clone them rather than instantiating the class manually, each time with the appropriate
    state.
     */
    public static void main(String[] args) {
        ShapeCache shapeCache = new ShapeCache();

        Shape shape = shapeCache.getShape("1");
        shape.draw();

        shape = shapeCache.getShape("2");
        shape.draw();

        shape = shapeCache.getShape("3");
        shape.draw();
    }
}
