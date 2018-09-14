package org.yevgen.visitor;

import java.util.ArrayList;
import java.util.List;

public class ParentAbstractTag extends AbstractTag {

    private final String tag;
    private List<AbstractTag> childrenTag;

    protected ParentAbstractTag(String tag) {
        this.tag = tag;
        childrenTag = new ArrayList<AbstractTag>();
    }

    public String getTag() {
        return tag;
    }

    public void generateHtml() {
        System.out.println(startTag);
        for(AbstractTag tag : getChildren()){
            tag.generateHtml();
        }
        System.out.println(endTag);
    }

    @Override
    public void addChildTag(AbstractTag abstractTag) {
        childrenTag.add(abstractTag);
    }

    @Override
    public void removeChildTag(AbstractTag abstractTag) {
        childrenTag.remove(abstractTag);
    }

    @Override
    public List<AbstractTag> getChildren() {
       return childrenTag;
    }
}
