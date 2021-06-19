package com.drbhagwat.chapter.one;

import java.util.Scanner;

/**
 * The following program is a solution to Exercise8 of Chapter1.
 * <p>
 * The following program reads a string and prints all of its substrings.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-06-08
 */
public class Exercise8 {
    /**
     * This method reads a string and prints all of its substrings.
     *
     * @param args - command-line arguments (none).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a string: ");
        // define a final variable to store the user input.
        final String string = scanner.nextLine();
        scanner.close();
        int stringLength = string.length();
        System.out.println("All substrings of " + string + " follow:");
        printSubStrings(string);
    }

    private static void printSubStrings(final String string) {
        // finding the length of the string
        final int stringLength = string.length();

        // selection of starting point
        for (int i = 0; i < stringLength; i++) {

            // selection of ending point
            for (int j = i; j < stringLength; j++) {
                System.out.print(',');

                // print from starting point to ending point
                for (int k = i; k <= j; k++) {
                    System.out.print(string.charAt(k));
                }
            }
        }
        System.out.println();
    }
}

