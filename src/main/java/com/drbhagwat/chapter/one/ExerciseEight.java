package com.drbhagwat.chapter.one;

import java.util.Scanner;

/**
 * The following program reads a string and prints all of its substrings.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-June-28
 */
public class ExerciseEight {
  /**
   * This method reads a string and prints all of its substrings.
   *
   * @param args - command-line arguments (none).
   */
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    System.out.print("Please input a string: ");
    // define a final variable to store the user input.
    final var string = scanner.nextLine();
    scanner.close(); // close the system resource once done. System resources are limited in number * best practice
    System.out.print("All substrings of " + string + " follow: ");
    printSubStrings(string);
  }

  private static void printSubStrings(final String string) {
    // finding the length of the string
    final int stringLength = string.length();

    // selection of starting point
    for (var i = 0; i < stringLength; i++) {

      // selection of ending point
      for (var j = i; j < stringLength; j++) {

        // print from starting point to ending point
        for (var k = i; k <= j; k++) {
          System.out.print(string.charAt(k));
        }

        if (i != stringLength - 1) {
          System.out.print(',');
        }
      }
    }
    System.out.println();
  }
}

