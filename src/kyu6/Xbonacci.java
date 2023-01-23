package kyu6;

/**
 * 6 kyu - Tribonacci Sequence
 *
 * https://www.codewars.com/kata/556deca17c58da83c00002db/java
 *
 * DESCRIPTION:
 * Well met with Fibonacci bigger brother, AKA Tribonacci.
 *
 * As the name may already reveal, it works basically like a Fibonacci, but summing the last 3 (instead of 2) numbers of the sequence to generate the next.
 * And, worse part of it, regrettably I won't get to hear non-native Italian speakers trying to pronounce it :(
 *
 * Well, you may have guessed it by now, but to be clear: you need to create a fibonacci function that given a signature array/list, returns the first n elements - signature included of the so seeded sequence.
 *
 * Signature will always contain 3 numbers; n will always be a non-negative number; if n == 0, then return an empty array (except in C return NULL) and be ready for anything else which is not clearly specified ;)
 */

public class Xbonacci {
    public double[] tribonacci(double[] s, int n) {
        double[] arr = new double[n];
        if (n == 0) return arr;

        arr[0] = s[0];
        if (arr.length > 1)arr[1] = s[1];
        if (arr.length > 2)arr[2] = s[2];
        for (int i = 3; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        }
        return arr;
    }
}
