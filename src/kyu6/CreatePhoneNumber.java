package kyu6;

/**
 *  6 kyu - Create Phone Number
 *
 *  https://www.codewars.com/kata/525f50e3b73515a6db000b83/java
 *
 *  DESCRIPTION:
 * Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.
 *
 * The returned format must be correct in order to complete this challenge.
 *
 * Don't forget the space after the closing parentheses!
 */

public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        String phoneNumber = new String("(xxx) xxx-xxxx");

        for (int i : numbers) {
            phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(i));
        }

        return phoneNumber;
    }
}
