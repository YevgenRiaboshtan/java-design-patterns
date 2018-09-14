package org.yevgen.visitor;

public class Body extends ParentAbstractTag {

    protected Body() {
        super("body");
        setStartTag("<body>");
        setEndTag("</body>");
    }
}
