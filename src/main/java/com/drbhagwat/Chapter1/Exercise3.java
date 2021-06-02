package com.drbhagwat.Chapter1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The following program is a solution to Exercise3 of Chapter1.
 * <p>
 * Using only the conditional operator, write a program that reads three integers and prints the largest. Repeat with
 * Math.max.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-06-01
 */
public class Exercise3 {
    /**
     * This method prompts the end-user to enter 3 integers (either on a single line, separated by white space
     * or on three separate lines).
     * If any integer entered is invalid, the method re-enters the while loop prompting for valid integers again.
     * If all 3 integers entered are valid, the method processes the integers for the desired output.
     *
     * @param args - command-line arguments (none).
     * @throws InputMismatchException - throws this Exception, when an invalid integer is read.
     */
    public static void main(String[] args) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please input 3 integers (on a single line, separated by white space or " +
                    "on three separate lines)" + ": ");

            try {
                int number1 = scanner.nextInt();
                int number2 = scanner.nextInt();
                int number3 = scanner.nextInt();

                System.out.println("The three numbers are " + number1 + " " + number2 + " " + number3);

                int greater = (number1 > number2) ? number1 : number2;
                int greatest = (greater > number3) ? greater : number3;

                System.out.println("The largest is " + greatest);

                greater = Math.max(number1, number2);
                greatest = Math.max(number3, greater);

                System.out.println("The largest is " + greatest);

                break;
            } catch (InputMismatchException imE) {
                scanner.nextLine(); // skip the new-line still present in the input steam
            }
        }
        // As a good practice, always close the system resource (when not needed), as they are limited in number
        scanner.close();
    }
}
