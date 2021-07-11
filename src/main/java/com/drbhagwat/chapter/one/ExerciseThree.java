package com.drbhagwat.chapter.one;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Using only the conditional operator, write a program that reads 3 integers and prints the largest. Repeat with
 * Math.max.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-July-11
 */
public class ExerciseThree {
  /**
   * This method prompts the end-user to enter 3 integers (either on a single line, separated by white space
   * or on three separate lines). If any integer entered is invalid, it keeps prompting for 3 integers until the user
   * enters all three valid integers. Otherwise, it uses only the conditional operator, prints the largest. It repeats
   * the solution with Math.max.
   *
   * @param args - command-line arguments (none).
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Please input 3 integers (either on a single line, separated by white space " +
          "or on three separate lines: ");

      try {
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        scanner.close(); // close the system resource as soon as you are done. Resources are limited in number.
        String message = "The three numbers are " + number1 + " " + number2 + " " + number3;
        // get the name of the class in a generic way from the current thread instead of hardcoding
        Logger logger = Logger.getLogger(Thread.currentThread().getClass().getName());
        logger.info(message);
        int larger = (number1 > number2) ? number1 : number2;
        int largest = (larger > number3) ? larger : number3;
        message = "The largest is " + largest;
        logger.info(message);
        larger = Math.max(number1, number2);
        largest = Math.max(number3, larger);
        message = "The largest is " + largest;
        logger.info(message);
        break; // break out of the while, as we successfully read three integers
      } catch (Exception exception) {  // catch the common exception, as multiple exceptions could be thrown
        scanner.nextLine(); // the input is invalid, move the scanner past the invalid to the new-line and go to while
      }
    }
  }
}
