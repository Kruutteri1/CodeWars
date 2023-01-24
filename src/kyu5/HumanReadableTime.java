package kyu5;

/**
 * 5 kyu - HumanReadableTime
 *
 * https://www.codewars.com/kata/52685f7382004e774f0001f7/java
 *
 * DESCRIPTION:
 * Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)
 *
 * HH = hours, padded to 2 digits, range: 00 - 99
 * MM = minutes, padded to 2 digits, range: 00 - 59
 * SS = seconds, padded to 2 digits, range: 00 - 59
 * The maximum time never exceeds 359999 (99:59:59)
 */

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        if (seconds <= 0) return "00:00:00";

        String result = "";
        int[] units = new int[] {3600, 60, 1};

        for (int i = 0; i < 3; i++) {
            if (seconds >= units[i]) {
                int q = seconds / units[i];
                seconds %= units[i];
                result += (q <= 9 ? "0" : "") + q + ":";
            } else {
                result += "00:";
            }
        }
        return result.substring(0, result.length() - 1);
    }
}
