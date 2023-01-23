package kyu5;

/**
 * 5 kyu - Number of trailing zeros of N!
 *
 * https://www.codewars.com/kata/52f787eb172a8b4ae1000a34/java
 *
 * DESCRIPTION:
 * Write a program that will calculate the number of trailing zeros in a factorial of a given number.
 *
 * N! = 1 * 2 * 3 *  ... * N
 *
 * Be careful 1000! has 2568 digits...
 */

public class NumberZeros {
    public static int zeros(int n) {
        int count = 0;
        while(n > 0) {
            n /= 5;
            count += n;
        }
        return count;
    }
}
