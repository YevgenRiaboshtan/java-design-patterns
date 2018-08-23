package org.yevgen.prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ShapeCache {

    private Map<String, Shape> shapeMap = new HashMap<>();

    public ShapeCache() {
        Shape shape = new Circle();
        shape.setId("1");
        shapeMap.put(shape.getId(), shape);

        shape = new Rectangle();
        shape.setId("2");
        shapeMap.put(shape.getId(), shape);

        shape = new Square();
        shape.setId("3");
        shapeMap.put(shape.getId(), shape);
    }

    public Shape getShape(String shapeId) {
        Shape shape = shapeMap.get(shapeId);
        if (Objects.nonNull(shape)) {
            return (Shape) shape.clone();
        }
        return null;
    }
}
