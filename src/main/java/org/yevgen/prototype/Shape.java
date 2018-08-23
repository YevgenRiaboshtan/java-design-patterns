package org.yevgen.prototype;

public abstract class Shape implements Cloneable {
    private String id;
    private final String type;

    protected Shape(String type) {
        this.type = type;
    }

    public abstract void draw();

    public String getId() {
        return id;
    }

    public Shape setId(String id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
