package org.yevgen.factory.method;

public class WebForm extends Form {
    @Override
    protected Button getButton() {
        return new HtmlButton();
    }
}
