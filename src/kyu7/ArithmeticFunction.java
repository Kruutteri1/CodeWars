package kyu7;

/**
 * 7 kyu - Make a function that does arithmetic!
 *
 * https://www.codewars.com/kata/583f158ea20cfcbeb400000a/java
 *
 * DESCRIPTION:
 * Given two numbers and an arithmetic operator (the name of it, as a string), return the result of the two numbers having that operator used on them.
 *
 * a and b will both be positive integers, and a will always be the first number in the operation, and b always the second.
 *
 * The four operators are "add", "subtract", "divide", "multiply".
 *
 * A few examples:(Input1, Input2, Input3 --> Output)
 *
 * 5, 2, "add"      --> 7
 * 5, 2, "subtract" --> 3
 * 5, 2, "multiply" --> 10
 * 5, 2, "divide"   --> 2.5
 */

public class ArithmeticFunction {
    public static int arithmetic(int a, int b, String operator) {
        return switch (operator) {
            case "add" -> a + b;
            case "subtract" -> a - b;
            case "multiply" -> a * b;
            case "divide" -> a / b;
            default -> 0;
        };
    }
}
