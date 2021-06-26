package com.drbhagwat.chapter.one;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * This program reads in two integers between 0 and 4294967295 (both inclusive), stores them in int variables, and
 * computes and displays their unsigned sum, difference, product, quotient, and remainder. Do not convert them to
 * long values.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-June-26
 */
public class Exercise7 {
  private static final long LONG_VALUE_MIN = 0L;
  private static final long LONG_VALUE_MAX = 4294967295L;

  /**
   * This method computes reads in two integers between 0 and 4294967295, stores them in int variables, and computes and
   * displays their unsigned sum, difference, product, quotient, and remainder. Do not convert them to long values.
   *
   * @param args - command-line arguments (none).
   */
  public static void main(String[] args) {
    // get the name of the class in a generic way from the current thread instead of hardcoding
    var logger = Logger.getLogger(Thread.currentThread().getClass().getName());
    var scanner = new Scanner(System.in);

    while (true) {
      System.out
          .print("Please input two integers (each of them separated by white space, or on a separate line) - both should lie between " +
              LONG_VALUE_MIN + " and " + LONG_VALUE_MAX + " (both inclusive): ");

      try {
        var longValue1 = scanner.nextLong();
        var longValue2 = scanner.nextLong();
        var message = "";

        if (longValue1 < LONG_VALUE_MIN || longValue1 > LONG_VALUE_MAX) {
          message = "The first integer is not within the range " + LONG_VALUE_MIN + " and " +
              LONG_VALUE_MAX + " Please re-enter both integers.";
          logger.info(message);
          scanner.nextLine(); // move the scanner to the beginning of next line for an invalid input
          continue;
        }
        if (longValue2 < LONG_VALUE_MIN || longValue2 > LONG_VALUE_MAX) {
          message = "The second integer is not within the range " + LONG_VALUE_MIN + " and " +
              LONG_VALUE_MAX + " Please re-enter both integers.";
          logger.info(message);
          scanner.nextLine(); // move the scanner to the beginning of next line for an invalid input
          continue;
        }
        scanner.close(); // close the system resource once done. System resources are limited in number * best practice
        var intValue1 = (int) Integer.toUnsignedLong((int) longValue1);
        var intValue2 = (int) Integer.toUnsignedLong((int) longValue2);

        message = "The first integer is " + intValue1;
        logger.info(message);
        message = "The second integer is " + intValue2;
        logger.info(message);
        message = "Their sum is " + (intValue1 + intValue2);
        logger.info(message);
        message = "Their difference is " + (intValue1 - intValue2);
        logger.info(message);
        message = "Their product is " + intValue1 * intValue2;
        logger.info(message);
        message = "Their quotient is " + Integer.divideUnsigned(intValue1, intValue2);
        logger.info(message);
        message = "Their remainder is " + Integer.remainderUnsigned(intValue1, intValue2);
        logger.info(message);
        break; // break out of the while, as we successfully read an integer
      } catch (Exception exception) {
        scanner.nextLine();// move the scanner to the beginning of next line for an invalid input
      }
    }
  }
}