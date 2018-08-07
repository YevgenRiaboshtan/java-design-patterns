package org.yevgen.composite;

public class Head extends ParentAbstractTag {
    protected Head() {
        super("head");
        setStartTag("<head>");
        setEndTag("</head>");
    }
}
