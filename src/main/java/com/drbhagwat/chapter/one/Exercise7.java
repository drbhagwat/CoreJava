package com.drbhagwat.chapter.one;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This program reads in two integers between 0 and 4294967295 (both inclusive), stores them in int variables, and
 * computes and displays their unsigned sum, difference, product, quotient, and remainder. Do not convert them to
 * long values.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-06-05
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
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out
          .print("Please input two integers (each of them being separated by white space, or on a separate line) - both should lie between " +
              LONG_VALUE_MIN + " and " + LONG_VALUE_MAX + " (both inclusive): ");

      try {
        long longValue1 = scanner.nextLong();

        if (longValue1 < LONG_VALUE_MIN || longValue1 > LONG_VALUE_MIN) {
          System.out.println("The first integer is not within the range " + LONG_VALUE_MIN + " and " +
              LONG_VALUE_MAX + " Please re-enter it.");
          scanner.nextLine(); // skip the new-line still present in the input steam
          continue;
        }
        long longValue2 = scanner.nextLong();

        if (longValue2 < LONG_VALUE_MIN || longValue2 > LONG_VALUE_MAX) {
          System.out.println("The second integer is not within the range " + LONG_VALUE_MIN + " and " +
              LONG_VALUE_MAX + " Please re-enter it.");
          scanner.nextLine(); // skip the new-line still present in the input steam
          continue;
        }
        int intValue1 = (int) Integer.toUnsignedLong((int) longValue1);
        int intValue2 = (int) Integer.toUnsignedLong((int) longValue2);

        System.out.println("The first integer is " + intValue1);
        System.out.println("The second integer is " + intValue2);
        System.out.println("Their sum is " + (intValue1 + intValue2));
        System.out.println("Their difference is " + (intValue1 - intValue2));
        System.out.println("Their product is " + intValue1 * intValue2);
        System.out.println("Their quotient is " + Integer.divideUnsigned(intValue1, intValue2));
        System.out.println("Their remainder is " + Integer.remainderUnsigned(intValue1, intValue2));
        scanner.close();
        break;
      } catch (InputMismatchException imE) {
        scanner.nextLine(); // skip the new-line still present in the input steam
      }
    }
  }
}