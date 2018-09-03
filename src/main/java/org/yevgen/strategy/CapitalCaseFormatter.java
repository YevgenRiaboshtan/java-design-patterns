package org.yevgen.strategy;

public class CapitalCaseFormatter implements TextFormatter {
    @Override
    public String format(String text) {
        return text.toUpperCase();
    }
}
