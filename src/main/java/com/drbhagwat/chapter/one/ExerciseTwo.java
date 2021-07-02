package com.drbhagwat.chapter.one;

import java.util.Scanner;
import java.util.logging.Logger;


/**
 * Write a program to read an integer angle and normalize it to a value between 0 and 359 degrees, Give two solutions
 * - the first with the % operator, and the second with the floorMod.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-July-02
 */
public class ExerciseTwo {
  /**
   * This method prompts the user to enter an integer angle from the standard input (stdin). If the entered integer
   * angle invalid, it keeps prompting until the user enters a valid integer angle. Otherwise, it normalizes the read
   * integer angle to a value between 0 and 359 degrees, It gives two solutions - the first with the % operator, and
   * the second with the floorMod.
   *
   * @param args - command-line arguments (none).
   */
  public static void main(String[] args) {
    // get the name of the class in a generic way from the current thread instead of hardcoding
    Logger logger = Logger.getLogger(Thread.currentThread().getClass().getName());
    Scanner scanner = new Scanner(System.in);

    while (true) {
      logger.info("Please input an integer angle:");

      try {
        int angle = scanner.nextInt();
        scanner.close(); // close the system resource once done. System resources are limited in number * best practice
        angle %= 360;
        angle = (angle < 0) ? (angle + 360) : angle;
        String message = String.format("The normalized angle using modulus operator is : %d", angle);
        logger.info(message);
        message =
            String.format("The normalized angle using Math.floorMod is : %d", Math.floorMod(angle, 360));
        logger.info(message);
        break; // break out of the while, as we successfully read an integer angle
      } catch (Exception exception) { // catch the common exception, as multiple exceptions could be thrown
        scanner.nextLine(); // move the scanner to the beginning of next line for an invalid input
      }
    }
  }
}