package org.yevgen.visitor;

public class Main {

    /*
    Use the Visitor pattern when:
    • An object structure contains many classes of objects with differing interfaces, and you want to perform operations on these
    objects that depend on their concrete classes.
    • Many distinct and unrelated operations need to be performed on objects in an object structure, and you want to avoid "polluting"
    their classes with these operations. Visitor lets you keep related operations together by defining them in one class. When the
    object structure is shared by many applications, use Visitor to put operations in just those applications that need them.
    • The classes defining the object structure rarely change, but you often want to define new operations over the structure. Changing
    the object structure classes requires redefining the interface to all visitors, which is potentially costly. If the object structure
    classes change often, then it’s probably better to define the operations in those classes.
     */
    public static void main(String[] args) {
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

        System.out.println("AFTER VISITORS");

        Visitor cssClass = new CssClassVisitor();
        Visitor style = new StyleVisitor();

        page.accept(cssClass);
        page.accept(style);

        head.accept(style);
        body.accept(style);

        h.accept(cssClass);

        page.generateHtml();
    }
}
