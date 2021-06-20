package com.drbhagwat.chapter.one;

import java.util.Scanner;
import java.util.logging.Logger;


/**
 * The following program is a solution to Exercise 2 of Chapter 1.
 * <p>
 * Write a program that reads an integer angle (which may be positive or negative) and normalizes it to a value
 * between 0 and 359 degrees. Try it first with the % operator, then with floorMod.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-June-20
 */
public class ExerciseTwo {
    /**
     * This method prompts the user to enter an integer angle from the standard input.
     * If the entered integer angle invalid, the method re-enters the while loop prompting again.
     * If the entered integer angle is valid, the method processes the integer angle for the desired output.
     *
     * @param args - command-line arguments (none).
     */
    public static void main(String[] args) {
        var logger = Logger.getLogger(Thread.currentThread().getClass().getName());
        var scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please input an integer angle: ");

            try {
                var angle = scanner.nextInt();
                // best practice is to close the system resource once done, as they might be limited in number
                scanner.close();
                angle %= 360;
                angle = (angle < 0) ? (angle + 360) : angle;
                var message = String.format("The normalized angle using modulus operator is : %d", angle);
                logger.info(message);
                message =
                        String.format("The normalized angle using Math.floorMod is : %d", Math.floorMod(angle, 360));
                logger.info(message);
                break;
            } catch (Exception exception) { // catch the common exception, as multiple exceptions could be thrown
                scanner.nextLine(); // skip the new-line present in the input steam
            }
        }
    }
}