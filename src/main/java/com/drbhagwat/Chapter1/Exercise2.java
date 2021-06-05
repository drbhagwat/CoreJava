package com.drbhagwat.Chapter1;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * The following program is a solution to Exercise2 of Chapter1.
 * <p>
 * Write a program that reads an integer angle (which may be positive or negative) and normalizes it to a value
 * between 0 and 359 degrees. Try it first with the % operator, then with floorMod.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-06-01
 */
public class Exercise2 {
    /**
     * This method prompts the end-user to enter an integer angle from the standard input.
     * If the integer angle entered is invalid, the method re-enters the while loop prompting for a valid integer again.
     * If the integer angle entered is valid, the method processes the integer for the desired output.
     *
     * @param args - command-line arguments (none).
     * @throws InputMismatchException - throws this Exception, when an invalid integer is read.
     */
    public static void main(String args[]) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please input an integer angle (positive or negative): ");

            try {
                int angle = scanner.nextInt();
                angle = (angle %= 360) < 0 ? (angle + 360) : angle;
                System.out.printf("The normalized angle using modulus operator is -> %d\n", angle);
                System.out.printf("The normalized angle using Math.floorMod is -> %d\n", Math.floorMod(angle, 360));
                // As a good practice, always close the system resource (when not needed), as they are limited in number
                scanner.close();
                break;
            } catch (InputMismatchException imE) {
                scanner.nextLine(); // skip the new-line still present in the input steam
            }
        }
    }
}