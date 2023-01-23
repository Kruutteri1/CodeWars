package kyu6;

/**
 * 6 kyu - Find the unique number
 *
 * https://www.codewars.com/kata/585d7d5adb20cf33cb000235/java
 *
 * DESCRIPTION:
 * There is an array with some numbers. All numbers are equal except for one. Try to find it!
 *
 * It’s guaranteed that array contains at least 3 numbers.
 *
 * The tests contain some very huge arrays, so think about performance.
 *
 * This is the first kata in series:
 */



public class FindUniqueNum {
    public static double findUniq(double arr[]) {
        double num1 = arr[0];
        double num2 = arr[1];

        for (int i = 2; i < arr.length; i++) {
            if (num1 == num2) {
                if (arr[i] != num1) {
                    return arr[i];
                }
            } else {
                if (arr[i] == num1) {
                    return num2;
                } else {
                    return num1;
                }
            }
        }
        return 0;
    }
}
