package kyu7;

/**
 * 7 kyu - String ends with?
 *
 * https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d/java
 *
 * DESCRIPTION:
 * Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).
 *
 * Examples:
 *
 * solution('abc', 'bc') // returns true
 * solution('abc', 'd') // returns false
 */

public class StringEnds {
    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);
    }
}
