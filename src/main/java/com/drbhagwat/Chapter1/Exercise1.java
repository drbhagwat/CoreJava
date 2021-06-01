package com.drbhagwat.Chapter1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The following program is a solution to Exercise1 of Chapter1.
 * <p>
 * Write a program that reads an integer and prints it in binary, octal and hexadecimal.
 * Print the reciprocal as a hexadecimal floating-point number.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-06-01
 */
public class Exercise1 {
    /**
     * This method prompts the end-user to enter an integer from the standard input.
     * If the integer entered is invalid, the method re-enters the while loop prompting for a valid integer again.
     * If the integer entered is valid, the method processes the integer for the desired output.
     *
     * @param args - command-line arguments (none).
     * @throws InputMismatchException - throws this Exception, when an invalid integer is read.
     */
    public static void main(String[] args) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please input an integer -> " + " ");

            try {
                int i = scanner.nextInt();
                System.out.printf("The integer %d's binary equivalent is -> %s, " +
                                "octal equivalent  is -> %o, " +
                                "hex equivalent is -> %x, " +
                                "and its reciprocal (in hex) is -> %a",
                        i, Integer.toBinaryString(i), i, i, 1.0 / i);
                break;
            } catch (InputMismatchException imE) {
                scanner.nextLine(); // skip the new-line still present in the input steam
            }
        }
        // As a good practice, always close the system resource (when not needed), as they are limited in number
        scanner.close();
    }
}