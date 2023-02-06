package kyu6;

/**
 *  6 kyu - Roman Numerals Encoder
 *
 * https://www.codewars.com/kata/51b62bf6a9c58071c600001b/java
 *
 * DESCRIPTION:
 * Create a function taking a positive integer between 1 and 3999 (both included) as its parameter and returning a string containing the Roman Numeral representation of that integer.
 *
 * Modern Roman numerals are written by expressing each digit separately starting with the left most digit and skipping any digit with a value of zero.
 * In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC. 2008 is written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.
 */

public class Conversion {
    public static String solution(int n) {
        if (n <= 0) return "";
        int[] symbol = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] Value = new String[] {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String result = "";

        for (int i = 0; i < 13; i++) {
            while (n >= symbol[i]) {
                n -= symbol[i];
                result += Value[i];
            }
        }

        return result;
    }
}
