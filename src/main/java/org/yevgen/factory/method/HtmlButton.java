package org.yevgen.factory.method;

public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("Render HTML button");
    }
}
