package org.yevgen.visitor;

import java.util.Arrays;
import java.util.List;

public class Html extends ParentAbstractTag {

    private AbstractTag head;
    private AbstractTag body;

    protected Html() {
        super("html");
        setStartTag("<html>");
        setEndTag("</html>");
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public void addChildTag(AbstractTag abstractTag) {
        ((AbstractTag) this).addChildTag(abstractTag);
    }

    @Override
    public void removeChildTag(AbstractTag abstractTag) {
        ((AbstractTag) this).removeChildTag(abstractTag);
    }

    @Override
    public List<AbstractTag> getChildren() {
        return Arrays.asList(head, body);
    }
}
