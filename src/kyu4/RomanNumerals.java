package kyu4;

/**
 *  4 kyu - Roman Numerals Helper
 *
 *  https://www.codewars.com/kata/51b66044bce5799a7f000003/java
 *
 *  DESCRIPTION:
 * Create a RomanNumerals class that can convert a roman numeral to and from an integer value.
 * It should follow the API demonstrated in the examples below. Multiple roman numeral values will be tested for each helper method.
 *
 * Modern Roman numerals are written by expressing each digit separately starting with the left most digit and skipping any digit with a value of zero.
 * In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC. 2008 is written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.
 * Examples
 *
 * RomanNumerals.toRoman(1000) // should return 'M'
 * RomanNumerals.fromRoman("M") // should return 1000
 */

import java.util.*;

public class RomanNumerals {

    public static String toRoman(int n) {
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

    public static int fromRoman(String romanNumeral) {
        StringBuilder sb = new StringBuilder(romanNumeral);
        HashMap<String, Integer> list = new HashMap<>();
        list.put("I", 1);
        list.put("V", 5);
        list.put("X", 10);
        list.put("L", 50);
        list.put("C", 100);
        list.put("D", 500);
        list.put("M", 1000);
        list.put("IV", 4);
        list.put("IX", 9);
        list.put("XL", 40);
        list.put("XC", 90);
        list.put("CD", 400);
        list.put("CM", 900);

        int sum = 0;

        for (int i = 0; i < sb.length() - 1; i++) {
            String line = sb.substring(i, i + 2);
            if (list.get(line) != null) {
                sum += list.get(line);
                sb.delete(i, i + 2);
                i--;
            }
        }

        for (int i = 0; i < sb.length(); i++) {
            char a = sb.charAt(i);
            String str = String.valueOf(a);
            sum += list.get(str);
        }
        return sum;
    }
}