package org.yevgen.visitor;

public class Head extends ParentAbstractTag {
    protected Head() {
        super("head");
        setStartTag("<head>");
        setEndTag("</head>");
    }
}
