package org.yevgen.visitor;

import java.util.List;

public abstract class AbstractTag implements Element {
    protected String startTag;
    protected String endTag;

    public abstract String getTag();

    public void setStartTag(String tag) {
        this.startTag = tag;
    }

    public String getStartTag() {
        return startTag;
    }

    public void setEndTag(String tag) {
        this.endTag = tag;
    }

    public void setTagBody(String tagBody) {
        throw new UnsupportedOperationException("Current operation is not support - for this object");
    }

    public void addChildTag(AbstractTag abstractTag) {
        throw new UnsupportedOperationException("Current operation is not support - for this object");
    }

    public void removeChildTag(AbstractTag abstractTag) {
        throw new UnsupportedOperationException("Current operation is not support - for this object");
    }

    public List<AbstractTag> getChildren() {
        throw new UnsupportedOperationException("Current operation is not support - for this object");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public abstract void generateHtml();
}
