package org.yevgen.visitor;

public class H extends AbstractTag {

    private String tagBody;

    public H() {
        setStartTag("<h>");
        setEndTag("</h>");
    }

    public String getTag() {
        return "h";
    }

    @Override
    public void setTagBody(String tagBody) {
        this.tagBody = tagBody;
    }

    public void generateHtml() {
        System.out.println(startTag + tagBody + endTag);
    }
}
