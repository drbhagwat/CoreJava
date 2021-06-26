package com.drbhagwat.chapter.one;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Using only the conditional operator, write a program that reads 3 integers and prints the largest. Repeat with
 * Math.max.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-June-26
 */
public class ExerciseThree {
  /**
   * This method prompts the end-user to enter 3 integers (either on a single line, separated by white space
   * or on three separate lines). If any integer entered is invalid, it keeps prompting for 3 integers until the user
   * enters valid integers. Otherwise, it uses only the conditional operator, prints the largest. It repeats the
   * solution with Math.max.
   *
   * @param args - command-line arguments (none).
   */
  public static void main(String[] args) {
    // get the name of the class in a generic way from the current thread instead of hardcoding
    var logger = Logger.getLogger(Thread.currentThread().getClass().getName());
    var scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Please input 3 integers (either on a single line, separated by white space " +
          "or on three separate lines)" + ": ");

      try {
        var number1 = scanner.nextInt();
        var number2 = scanner.nextInt();
        var number3 = scanner.nextInt();

        scanner.close(); // close the system resource once done. System resources are limited in number * best practice
        var message = "The three numbers are " + number1 + " " + number2 + " " + number3;
        logger.info(message);

        var greater = (number1 > number2) ? number1 : number2;
        var greatest = (greater > number3) ? greater : number3;
        message = "The largest is " + greatest;
        logger.info(message);

        greater = Math.max(number1, number2);
        greatest = Math.max(number3, greater);
        message = "The largest is " + greatest;
        logger.info(message);

        break; // break out of the while, as we successfully read an integer angle
      } catch (Exception exception) {  // catch the common exception, as multiple exceptions could be thrown
        scanner.nextLine(); // move the scanner to the beginning of next line for an invalid input
      }
    }
  }
}
