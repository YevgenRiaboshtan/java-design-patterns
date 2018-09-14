package org.yevgen.visitor;

public class StyleVisitor implements Visitor {
    @Override
    public void visit(AbstractTag element) {
        element.setStartTag(element.getStartTag().replace(">", " style='width:90%'>"));
    }
}
