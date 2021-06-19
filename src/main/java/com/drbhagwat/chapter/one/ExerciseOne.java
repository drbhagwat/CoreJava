package com.drbhagwat.chapter.one;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * The following program is a solution to Exercise 1 of Chapter 1.
 * <p>
 * Write a program that reads an integer and prints it in binary, octal and hexadecimal.
 * Print the reciprocal as a hexadecimal floating-point number.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-June-19
 */
public class ExerciseOne {
    /**
     * This method prompts the user to enter an integer from the standard input.
     * If the entered integer is invalid, the method re-enters the while loop prompting again.
     * If the entered integer is valid, the method processes the integer for the desired output.
     *
     * @param args - command-line arguments (none).
     * @throws InputMismatchException - throws this Exception, when an invalid integer is read.
     */
    public static void main(String[] args) throws InputMismatchException {
        var logger = Logger.getLogger(Thread.currentThread().getClass().getName());
        var scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please input an integer: ");

            try {
                var i = scanner.nextInt();
                // best practice is to close the system resource (as soon as done), as they may be limited in number
                scanner.close();
                var message = String.format("The integer %d's binary equivalent is -> %s, " +
                                "octal equivalent  is -> %o, " +
                                "hex equivalent is -> %x, " +
                                "and its reciprocal (in hex) is -> %a",
                        i, Integer.toBinaryString(i), i, i, 1.0 / i);
                logger.info(message);
                break; // breaks out of the while loop since we successfully read an integer
            } catch (InputMismatchException imE) {
                scanner.nextLine(); // skip the new-line, which still present in the input steam
            }
        }
    }
}