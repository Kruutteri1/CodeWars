package kyu3;

import java.util.Arrays;

/**
 *  3 kyu - How many are smaller than me II?
 *
 *  https://www.codewars.com/kata/56a1c63f3bc6827e13000006/java
 *
 *  DESCRIPTION:
 * This is a hard version of How many are smaller than me?. If you have troubles solving this one, have a look at the easier kata first.
 *
 * Write
 *
 * function smaller(arr)
 * that given an array arr, you have to return the amount of numbers that are smaller than arr[i] to the right.
 *
 * For example:
 *
 * smaller([5, 4, 3, 2, 1]) === [4, 3, 2, 1, 0]
 * smaller([1, 2, 0]) === [1, 1, 0]
 *
 */

public class HowManySmaller {
    public static int[] smaller(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        int min = Arrays.stream(arr).min().orElse(Integer.MAX_VALUE);
        int max = Arrays.stream(arr).max().orElse(Integer.MIN_VALUE);

        int[] count = new int[max - min + 1];

        for (int i = n - 1; i >= 0; i--) {
            int num = arr[i];
            int adjustedNum = num - min;

            // Count the number of elements smaller than the current element
            for (int j = adjustedNum - 1; j >= 0; j--) {
                result[i] += count[j];
            }
            // Increment counter for current element
            count[adjustedNum]++;
        }
        return result;
    }
}
