package kyu6;

/**
 * 6 kyu - Sum of Digits / Digital Root
 *
 * https://www.codewars.com/kata/541c8630095125aba6000c00/java
 *
 * DESCRIPTION:
 * Digital root is the recursive sum of all the digits in a number.
 *
 * Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced.
 * The input will be a non-negative integer.
 *
 */

public class DRoot {
    public static int digital_root(int n) {
        int sum = 0;
        while (true) {
            while (n > 9) {
                sum += n % 10;
                n /= 10;
            }
            sum += n;
            if (sum > 9) {
                n = sum;
                sum = 0;
            } else {
                return sum;
            }
        }
    }
}
