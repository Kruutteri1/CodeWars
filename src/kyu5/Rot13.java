package kyu5;

/**
 *  5 kyu - ROT13
 *
 *  https://www.codewars.com/kata/52223df9e8f98c7aa7000062/java
 *
 *  DESCRIPTION:
 * How can you tell an extrovert from an introvert at NSA?
 * Va gur ryringbef, gur rkgebireg ybbxf ng gur BGURE thl'f fubrf.
 *
 * I found this joke on USENET, but the punchline is scrambled. Maybe you can decipher it?
 * According to Wikipedia, ROT13 is frequently used to obfuscate jokes on USENET.
 *
 * For this task you're only supposed to substitute characters. Not spaces, punctuation, numbers, etc.
 *
 * Test examples:
 *
 * "EBG13 rknzcyr." -> "ROT13 example."
 *
 * "This is my first ROT13 excercise!" -> "Guvf vf zl svefg EBG13 rkprepvfr!"
 *
 */

public class Rot13 {
    public static String rot13(String message) {
        int diff = 0;
        String result = "";
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);

            if ((ch >= 'A' && ch <= 'M') || (ch >= 'a' && ch <= 'm')) {
                diff = 13;
            }
            if ((ch >= 'N' && ch <= 'Z') || (ch >= 'n' && ch <= 'z')) {
                diff = -13;
            }
            ch += diff;
            result += ch;
            diff = 0;
        }
        return result;
    }
}
