package com.drbhagwat.chapter.one;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Write a program to read an integer and print it in binary, octal, hexadecimal, and its reciprocal as a hexadecimal
 * floating-point number.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-July-11
 */
public class ExerciseOne {
  /**
   * This method prompts the user to enter an integer from the standard input (stdin). If the entered integer is
   * invalid, it keeps prompting until the user enters a valid integer. Otherwise, it prints the value of the integer
   * in binary, octal, hexadecimal, and its reciprocal as a hexadecimal floating-point number.
   *
   * @param args - command-line arguments (none).
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Please input an integer: ");

      try {
        int i = scanner.nextInt();
        scanner.close(); // close the system resource as soon as you are done. Resources are limited in number.
        String message = String.format("The integer %d's binary equivalent is: %s,%n " +
            "octal equivalent is: %o,%n " +
            "hex equivalent is: %x, and%n " +
            "its reciprocal (in hex) is: %a.", i, Integer.toBinaryString(i), i, i, 1.0 / i);
        // get the name of the class in a generic way from the current thread instead of hardcoding
        Logger logger = Logger.getLogger(Thread.currentThread().getClass().getName());
        logger.info(message);
        break; // break out of the while, as we successfully read an integer
      } catch (Exception exception) { // catch the common exception, as multiple exceptions could be thrown here
        scanner.nextLine(); // the input is invalid, move the scanner past the invalid to the new-line and go to while
      }
    }
  }
}