package org.yevgen.factory.method;

public abstract class Form {

    public void render() {
        Button button = getButton();
        button.render();
    }

    protected abstract Button getButton();
}
