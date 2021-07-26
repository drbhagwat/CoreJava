package com.drbhagwat.chapter.one;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Using only the conditional operator, write a program that reads 3 integers
 * and prints the largest. Repeat with Math.max.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-July-26
 */
public class FindLargestOfThreeIntegers {
  /**
   * This method prompts the end-user to enter 3 integers (either on a single
   * line, separated by white space or on three separate lines). If any
   * integer entered is invalid, it keeps prompting for 3 integers until the
   * user enters all three valid integers. Otherwise, it uses only the
   * conditional operator, prints the largest. It repeats the solution with
   * Math.max.
   *
   * @param args - command-line arguments (none).
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Please input 3 integers (either on a single line, " +
          "separated by white space or on three separate lines followed by " +
          "the enter key: ");

      /* get the name of the class in a generic way from the current
      thread instead of hardcoding */
      var logger =
          Logger.getLogger(Thread.currentThread().getClass().getName());

      try {
        int integer1 = scanner.nextInt();
        int integer2 = scanner.nextInt();
        int integer3 = scanner.nextInt();

        /* close the system resource as soon as you are done. Resources are
        limited in integer. */
        scanner.close();

        String output = String.format("The three integers are %d %d %d",
            integer1, integer2, integer3);
        logger.info(output);
        int larger = (integer1 > integer2) ? integer1 : integer2;
        int largest = (larger > integer3) ? larger : integer3;
        output = "The largest is " + largest + " using the ternary operator.";
        logger.info(output);

        largest = Math.max(integer3, Math.max(integer1, integer2));
        output = "The largest is " + largest + " using Math.max.";
        logger.info(output);
        break; // break out of the while, as we successfully read three integers
      } catch (InputMismatchException inputMismatchException) {
        var errorMessage = """
              Please specify an integer within the following acceptable range: 
              [-2147483648 to 2147483647]
            """;
        logger.info(errorMessage);
        /* when the input is invalid, move the scanner past the leftover
        input to the new-line and go back to the while loop */
        scanner.nextLine();
        // catch the common exception at the end
      } catch (Exception exception) { // this should never happen
        var errorMessage = "Error reading input. Exiting the program";
        logger.info(errorMessage);
        System.exit(-1);
      }
    }
  }
}
