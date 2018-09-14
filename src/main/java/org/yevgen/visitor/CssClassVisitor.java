package org.yevgen.visitor;

public class CssClassVisitor implements Visitor {
    @Override
    public void visit(AbstractTag element) {
        element.setStartTag(element.getStartTag().replace(">", " class='visitor'>"));
    }
}
