package org.yevgen.strategy;

public class TextEditor {

    private final TextFormatter textFormatter;

    public TextEditor(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    public void writeText(String text) {
        System.out.println(textFormatter.format(text));
    }
}
