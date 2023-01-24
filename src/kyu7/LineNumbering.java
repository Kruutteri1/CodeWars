package kyu7;

/**
 * 7 kyu - Testing 1-2-3
 *
 * https://www.codewars.com/kata/54bf85e3d5b56c7a05000cf9/java
 *
 * DESCRIPTION:
 * Your team is writing a fancy new text editor and you've been tasked with implementing the line numbering.
 *
 * Write a function which takes a list of strings and returns each line prepended by the correct number.
 *
 * The numbering starts at 1. The format is n: string. Notice the colon and space in between.
 *
 * Examples: (Input --> Output)
 *
 * [] --> []
 * ["a", "b", "c"] --> ["1: a", "2: b", "3: c"]
 */
import java.util.*;

public class LineNumbering {
    public static List<String> number(List<String> lines) {
        for(int i= 0; i< lines.size() ; i++) {
            lines.set(i,(i+1)+": "+lines.get(i));
        }
        return lines;
    }
}
