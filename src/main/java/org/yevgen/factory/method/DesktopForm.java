package org.yevgen.factory.method;

public class DesktopForm extends Form {
    @Override
    protected Button getButton() {
        return new DesktopButton();
    }
}
