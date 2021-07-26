package com.drbhagwat.chapter.one;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Write a program to read an integer from the user through the standard input
 * and print it in binary, octal, hexadecimal, and its reciprocal as a
 * hexadecimal floating-point number.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-July-26
 */
public class IntegerConversion {
  /**
   * This method prompts the user to type an integer from the standard input.
   * If the integer is invalid or out of acceptable range, it keeps prompting
   * until the user enters a valid integer. Otherwise, it prints the value of
   * the integer in binary, octal, hexadecimal, and its reciprocal as a
   * hexadecimal floating-point number.
   *
   * @param args - command-line arguments (none).
   */
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);

    do {
      System.out.print("Please input an integer followed by the enter key: ");

      /* obtain the name of the class in a generic way from the current
      thread instead of hardcoding */
      var logger =
          Logger.getLogger(Thread.currentThread().getClass().getName());

      try {
        var integer = scanner.nextInt(); // read an integer from stdin
        /* close the system resource as soon as you are done. Resources are
        limited in number. */
        scanner.close();
        String output = """
            The integer %d's binary equivalent is: %s,
            octal equivalent is: %o,
            hex equivalent is: %x, 
            and its reciprocal (in hex) is: %a.""".formatted(integer,
            Integer.toBinaryString(integer), integer, integer, 1.0 / integer);
        logger.info(output);
        // break out of the while, as the output is displayed
        break;
        // catch the specific exception first and see if you can recover
      } catch (InputMismatchException inputMismatchException) {
        var errorMessage = """
              Please specify an integer within the following acceptable range: 
              [-2147483648 to 2147483647]
            """;
        logger.info(errorMessage);
        /* when the input is invalid, move the scanner past the leftover
        input to the new-line and go back to the do-while loop */
        scanner.nextLine();
        // catch the common exception at the end
      } catch (Exception exception) { // this should never happen
        var errorMessage = "Error reading input. Exiting the program";
        logger.info(errorMessage);
        System.exit(-1);
      }
    } while (true);
  }
}