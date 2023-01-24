package kyu7;

/**
 * 7 kyu - Isograms
 *
 * https://www.codewars.com/kata/54ba84be607a92aa900000f1/java
 *
 * DESCRIPTION:
 * An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.
 *
 * Example: (Input --> Output)
 *
 * "Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)
 *
 * isIsogram "Dermatoglyphics" = true
 * isIsogram "moose" = false
 * isIsogram "aba" = false
 */
import java.util.Arrays;

public class isogram {
    public static boolean  isIsogram(String str) {
        str = str.toLowerCase();
        int len = str.length();

        char[] arr = str.toCharArray();

        Arrays.sort(arr);

        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1]) return false;
        }
        return true;
    }
}
