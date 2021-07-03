package com.drbhagwat.chapter.one;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * The following program reads a string and prints all of its substrings.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-July-03
 */
public class ExerciseEight {
  /**
   * This method reads a string and prints all of its substrings.
   *
   * @param args - command-line arguments (none).
   */
  public static void main(String[] args) {
    // get the name of the class in a generic way from the current thread instead of hardcoding
    Logger logger = Logger.getLogger(Thread.currentThread().getClass().getName());
    Scanner scanner = new Scanner(System.in);
    logger.info("Please input a string: ");
    // define a final variable to store the user input.
    final String string = scanner.nextLine();
    scanner.close(); // close the system resource once done. System resources are limited in number * best practice
    String message = "All substrings of " + string + " follow: ";
    logger.info(message);
    printSubStrings(string);
  }

  private static void printSubStrings(final String string) {
    // get the name of the class in a generic way from the current thread instead of hardcoding
    Logger logger = Logger.getLogger(Thread.currentThread().getClass().getName());
    // finding the length of the string
    final int stringLength = string.length();
    StringBuilder subStrings = new StringBuilder("");

    // selection of starting point
    for (int i = 0; i < stringLength; i++) {

      // selection of ending point
      for (int j = i; j < stringLength; j++) {

        // print from starting point to ending point
        for (int k = i; k <= j; k++) {
          subStrings.append(string.charAt(k));
        }

        if (i != stringLength - 1) {
          subStrings.append(',');
        }
      }
    }
    String message = String.valueOf(subStrings);
    logger.info(message);
  }
}

