package org.yevgen.composite;

public class Main {

    public static void main(String... args) {
        Html page = new Html();

        Head head = new Head();
        Body body = new Body();

        AbstractTag h = new H();
        h.setTagBody("Hello World!");

        AbstractTag h2 = new H();
        h2.setTagBody("Good bye!");

        body.addChildTag(h);
        body.addChildTag(h2);

        page.setHead(head);
        page.setBody(body);

        page.generateHtml();
    }

}
