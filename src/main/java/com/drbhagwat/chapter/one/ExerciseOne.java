package com.drbhagwat.chapter.one;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Write a program to read an integer and print it in binary, octal, hexadecimal, and its reciprocal as a hexadecimal
 * floating-point number.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-June-26
 */
public class ExerciseOne {
  /**
   * The following method prompts the user to enter an integer from the standard input (stdin). If the entered
   * integer is invalid, it keeps prompting until the user enters a valid integer. Otherwise, it prints the
   * value of the integer in binary, octal, hexadecimal, and its reciprocal as a hexadecimal floating-point number.
   *
   * @param args - command-line arguments (none).
   */
  public static void main(String[] args) {
    // get the name of the class in a generic way from the current thread instead of hardcoding
    var logger = Logger.getLogger(Thread.currentThread().getClass().getName());
    var scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Please input an integer: ");

      try {
        var i = scanner.nextInt(); // var was introduced in Java Version 10, which makes the code more concise
        scanner.close(); // close the system resource once done. System resources are limited in number * best practice
        var message = String.format("The integer %d's binary equivalent is: %s,%n " +
            "octal equivalent is: %o,%n " +
            "hex equivalent is: %x,%n " +
            "and its reciprocal (in hex) is: %a.", i, Integer.toBinaryString(i), i, i, 1.0 / i);
        logger.info(message);
        break; // break out of the while, as we successfully read an integer
      } catch (Exception exception) { // catch the common exception, as multiple exceptions could be thrown
        scanner.nextLine(); // move the scanner to the beginning of next line for an invalid input
      }
    }
  }
}