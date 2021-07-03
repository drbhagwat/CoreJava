package com.drbhagwat.chapter.one;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Write a program that reads a line of text and prints all the characters that are not ASCII together with their
 * Unicode values.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-July-03
 */
public class ExerciseEleven {
  /**
   * This method reads a line of text and prints all the characters that are not ASCII together with their Unicode
   * values.
   *
   * @param args - command-line arguments (none).
   */
  public static void main(String[] args) {
    // get the name of the class in a generic way from the current thread instead of hardcoding
    Logger logger = Logger.getLogger(Thread.currentThread().getClass().getName());
    logger.info("Please input a string: ");
    Scanner scanner = new Scanner(System.in);
    String string = scanner.nextLine();
    scanner.close(); // close the system resource once done. System resources are limited in number * best practice

    int length = string.codePointCount(0, string.length());
    int i = 0;

    logger.info("This program prints non-ASCII characters together with their Unicode values ");

    while (i < length) {
      int j = string.offsetByCodePoints(i, 1);
      String codePoint = string.substring(i, j);
      char c = codePoint.charAt(0);

      if (c > 127) {
        String message = String.format("%s \\u%04x", codePoint, (int) c);
        logger.info(message);
      }
      i = j;
    }
  }
}
