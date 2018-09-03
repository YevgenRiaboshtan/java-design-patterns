package org.yevgen.interpreter;

public class ExpressionUtils {

    public static boolean isOperator(String s) {
        return "+".equals(s) || "-".equals(s) || "*".equals(s);
    }

    public static Expression getOperator(String s, Expression left, Expression right) {
        s+="";
        switch (s) {
            case "+" :
                return new Add(left, right);
            case "-":
                return new Substract(left, right);
            case "*":
                return new Multiply(left, right);
        }
        return null;
    }
}
