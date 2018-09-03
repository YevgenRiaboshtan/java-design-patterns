package org.yevgen.strategy;

public class Main {

    /*
    Use the Strategy pattern when:
    • Many related classes differ only in their behavior. Strategies provide a way to configure a class with one of many behaviors.
    • You need different variants of an algorithm. For example, you might define algorithms reflecting different space/time trade-offs.
    Strategies can be used when these variants are implemented as a class hierarchy of algorithms.
    • An algorithm uses data that clients shouldn’t know about. Use the Strategy pattern to avoid exposing complex, algorithmspecific
    data structures.
    • A class defines many behaviors, and these appear as multiple conditional statements in its operations. Instead of many conditionals,
    move related conditional branches into their own Strategy class.
     */
    public static void main(String[] args) {
        TextFormatter textFormatter = new CapitalCaseFormatter();
        TextEditor textEditor = new TextEditor(textFormatter);
        textEditor.writeText("Some Text");

        textFormatter = new LowerCaseFormatter();
        textEditor = new TextEditor(textFormatter);
        textEditor.writeText("Some Text");
    }
}
