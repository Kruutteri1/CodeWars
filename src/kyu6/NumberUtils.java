package kyu6;

/**
 * 6 kyu - Does my number look big in this?
 *
 * https://www.codewars.com/kata/5287e858c6b5a9678200083c/java
 *
 * DESCRIPTION:
 * A Narcissistic Number (or Armstrong Number) is a positive number which is the sum of its own digits, each raised to the power of the number of digits in a given base.
 * In this Kata, we will restrict ourselves to decimal (base 10).
 *
 * Your code must return true or false (not 'true' and 'false') depending upon whether the given number is a Narcissistic number in base 10. This may be True and False in your language, e.g. PHP.
 *
 * Error checking for text strings or other invalid inputs is not required, only valid positive non-zero integers will be passed into the function.
 */

public class NumberUtils {
    public static boolean isNarcissistic(int number) {
        int first_number = number;
        String s = Integer.toString(number);
        int len = s.length();
        int sum = 0;
        while (number > 9) {
            int num = number % 10;
            number /= 10;

            sum += Math.pow(num, len);
        }
        sum += Math.pow(number, len);
        if (sum == first_number) return true;

        return false;
    }
}
