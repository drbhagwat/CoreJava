package com.drbhagwat.chapter.one;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Write a program to read an integer angle and normalize it to a value
 * between 0 and 359 degrees, Give two solutions - the first with the %
 * operator, and the second with the floorMod.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-July-22
 */
public class AngleNormalization {
  /**
   * This method prompts the user to enter an integer angle from the standard
   * input. If the entered integer angle invalid, it keeps prompting until
   * the user enters a valid integer angle. Otherwise, it normalizes the read
   * integer angle to a value between 0 and 359 degrees, It gives two
   * solutions - the first with the % operator, and the second with the
   * floorMod.
   *
   * @param args - command-line arguments (none).
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Please input an integer angle: ");

        /* get the name of the class in a generic way from the current thread
        instead of hardcoding */
      Logger logger =
          Logger.getLogger(Thread.currentThread().getClass().getName());

      try {
        var angle = scanner.nextInt();
         /* close the system resource as soon as you are done. Resources
         are limited in number.*/
        scanner.close();
        angle %= 360;
        angle = (angle < 0) ? (angle + 360) : angle;
        String message = String.format("The normalized angle using modulus " +
            "operator is : %d", angle);
        logger.info(message);
        message = String.format("The normalized angle using Math.floorMod is " +
            "%d", Math.floorMod(angle, 360));
        logger.info(message);
        // break out of the while, as we successfully read an integer
        break;
        // catch the application specific exception first
      } catch (InputMismatchException inputMismatchException) {
        var errorMessage = """
            Please specify an integer angle within the following acceptable 
            range: [-2147483648 to 2147483647]""";
        logger.info(errorMessage);
        /* when the input is invalid, move the scanner past the leftover
        input to the new-line and go back to the while loop */
        scanner.nextLine();
        // catch the common exception at the end
      } catch (Exception exception) {
        var errorMessage = "Error reading input. Exiting the program";
        logger.info(errorMessage);
        System.exit(-1);
      }
    }
  }
}