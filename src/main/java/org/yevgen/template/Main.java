package org.yevgen.template;

public class Main {

    /*
    The Template Method pattern should be used in the following cases:
    • To implement the invariant parts of an algorithm once and leave it up to subclasses to implement the behavior that can vary.
    • When common behavior among subclasses should be factored and localized in a common class to avoid code duplication. You
    first identify the differences in the existing code and then separate the differences into new operations. Finally, you replace the
    differing code with a template method that calls one of these new operations.
    • To control subclasses extensions. You can define a template method that calls "hook" operations (see Consequences) at specific
    points, thereby permitting extensions only at those points.
     */
    public static void main(String[] args) {
        ConnectionTemplate template = new MySqlConnection();
        template.process();
        System.out.println("-------------------");
        template = new OracleConnection();
        template.process();
    }
}
