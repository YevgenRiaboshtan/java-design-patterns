package org.yevgen.interpreter;

import java.util.Stack;

public class Main {

    /*
    Use the Interpreter pattern when there is a language to interpret, and you can represent statements in the language as abstract
    syntax trees. The Interpreter pattern works best when
    • The grammar is simple. For complex grammars, the class hierarchy for the grammar becomes large and unmanageable. Tools
    such as parser generators are a better alternative in such cases. They can interpret expressions without building abstract syntax
    trees, which can save space and possibly time.
    • Efficiency is not a critical concern. The most efficient interpreters are usually not implemented by interpreting parse trees
    directly but by first translating them into another form. For example, regular expressions are often transformed into state
    machines. But even then, the translator can be implemented by the Interpreter pattern, so the pattern is still applicable
     */
    public static void main(String[] args) {
        String postfixExpression = "10 1 - 2 4 + *";
        Stack<Expression> stack = new Stack<>();
        String[] expressionArray = postfixExpression.split(" ");
        for (String s : expressionArray) {
            if (ExpressionUtils.isOperator(s)) {
                Expression rightExpression = stack.pop();
                Expression leftExpression = stack.pop();
                Expression operator = ExpressionUtils.getOperator(s, leftExpression, rightExpression);
                int result = operator.interpret();
                stack.push(new Number(result));
            } else {
                stack.push(new Number(Integer.parseInt(s)));
            }
        }
        System.out.println("( " + postfixExpression + " ) = " + stack.pop().interpret());
    }
}
