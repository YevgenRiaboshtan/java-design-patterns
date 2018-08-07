package org.yevgen.composite;

import java.util.Arrays;
import java.util.List;

public class Body extends ParentAbstractTag {

    protected Body() {
        super("body");
        setStartTag("<body>");
        setEndTag("</body>");
    }
}
