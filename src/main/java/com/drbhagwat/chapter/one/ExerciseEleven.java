package com.drbhagwat.chapter.one;

import java.util.Scanner;

/**
 * Write a program that reads a line of text and prints all the characters
 * that are not ASCII together with their Unicode values.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-July-01
 */
public class ExerciseEleven {
    /**
     * This method reads a line of text and prints all the characters
     * * that are not ASCII together with their Unicode values.
     *
     * @param args - command-line arguments (none).
     */
    public static void main(String[] args) {
        System.out.print("Please input a string: ");
        var scanner = new Scanner(System.in);
        var string = scanner.nextLine();
        scanner.close(); // close the system resource once done. System resources are limited in number * best practice

        var length = string.codePointCount(0, string.length());
        var i = 0;

        System.out.println("This program prints non-ASCII characters together " +
                "with their Unicode values");

        while (i < length) {
            var j = string.offsetByCodePoints(i, 1);
            var codePoint = string.substring(i, j);
            var c = codePoint.charAt(0);

            if (c > 127) {
                System.out.println(codePoint);
                System.out.printf("\\u%04x%n", (int) c);
            }
            i = j;
        }
    }
}
