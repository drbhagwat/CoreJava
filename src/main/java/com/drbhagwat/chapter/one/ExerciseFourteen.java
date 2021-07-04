package com.drbhagwat.chapter.one;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Write a program that reads a two dimensional array of integers and determines whether it is a magic square (i.e.,
 * whether the sum of all rows, all columns, and the diagonals is the same). Accept lines of input that you break up
 * into individual integers, and stop when the user enters a blank line. For example, with the input:
 * 16 3 2 13
 * 5 10 11 8
 * 9 6 7 12
 * 4 15 14 1
 * (Blank line)
 * your program should respond affirmatively.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-July-04
 */

public class ExerciseFourteen {
  private static int sum;

  /**
   * This method reads a two dimensional array of integers and determines whether it is a magic square
   *
   * @param args - command-line arguments (none).
   */
  public static void main(String[] args) {
    final int MAX_ROWS = 100;
    /*
     * Allocate 100 rows (otherwise, you have to ask the user to enter the number of rows in the magic square) We do
     * not have to allocate the second dimension for the array; it will be decided later
     */
    int[][] array = new int[MAX_ROWS][];
    // get the name of the class in a generic way from the current thread instead of hardcoding
    Logger logger = Logger.getLogger(Thread.currentThread().getClass().getName());
    logger.info("Please input rows one after the other (separate elements within a row by a white " +
        "space), followed by a blank-line to end your input:");
    Scanner scanner = new Scanner(System.in);
    int rowCount = 0;

    while (scanner.hasNextLine()) {
      String row = scanner.nextLine();

      // check if the line is a blank line
      if ("".equals(row.trim())) {
        String message = "Is the given square a magic square? " + (isMagicSquare(array) ? "Yes" : "No");
        logger.info(message);
        scanner.close(); // close the system resource once done. System resources are limited in number * best practice
        break;
      }
      String[] rowElements = row.split("\\s+");
      int columnCount = rowElements.length;
      int[] columns = new int[columnCount];

      for (int i = 0; i < columnCount; i++) {
        columns[i] = Integer.parseInt(rowElements[i]);
      }
      array[rowCount++] = columns;
    }
  }

  /**
   * @param array - two dimensional array
   * @return the array has equal number osf rows and columns (square) or not
   */
  private static boolean isTheMatrixASquare(int[][] array) {
    final int rows = getNumberOfRows(array);

    // For each row, check if the number of columns is the same as the number of rows
    for (int i = 0; i < rows; i++) {

      if (array[i].length != rows) {
        return false;
      }
    }
    return true;
  }

  /**
   * @param array - two dimensional array
   * @return - number of rows (could be 0)
   */
  private static int getNumberOfRows(int[][] array) {
    int rows = 0;

    // calculate the total number of rows
    while (array[rows] != null) {
      rows++;
    }
    return rows;
  }

  /**
   * @param array - two dimensional array
   * @param rows  - number of rows
   * @return - true if all rows have teh same sum; false otherwise
   */
  private static boolean doAllRowsHaveSameSum(int[][] array, int rows) {
    int savedRowSum = 0;

    for (int i = 0; i < rows; i++) {
      // reset the sum for each row
      sum = 0;

      // keep accumulating sum of all columns in each row
      for (int j = 0; j < array[i].length; j++) {
        sum += array[i][j];
      }

      // save the sum only once
      if (i == 0) {
        savedRowSum = sum;
      } else {
        if (sum != savedRowSum) {
          return false;
        }
      }
    }
    return true;
  }

  /**
   * @param array   - two dimensional array
   * @param rows    - number of rows
   * @param columns - number of columns
   * @return true if all columns have the same sum; false otherwise
   */
  private static boolean doAllCoumnsHaveSameSum(int[][] array, int rows, int columns) {
    int savedColumnSum = 0;

    for (int j = 0; j < columns; j++) {
      // reset the sum for each column
      sum = 0;

      // keep accumulating sum of all rows in each column
      for (int i = 0; i < rows; i++) {
        sum += array[i][j];
      }

      // save the sum only once
      if (j == 0) {
        savedColumnSum = sum;
      } else {
        if (sum != savedColumnSum) {
          return false;
        }
      }
    }
    return true;
  }

  /**
   * @param array - two dimensional array
   * @return - true if the given two dimensional array is a magic square, false otherwise.
   */
  private static boolean isMagicSquare(int[][] array) {
    if (!isTheMatrixASquare(array)) {
      return false;
    }
    int rows = getNumberOfRows(array);

    if (!doAllRowsHaveSameSum(array, rows)) {
      return false;
    }

    if (!doAllCoumnsHaveSameSum(array, rows, rows)) {
      return false;
    }
    int diagonalSum = 0;

    for (int i = 0; i < rows; i++) {
      diagonalSum += array[i][i];
    }

    if (diagonalSum != sum) {
      return false;
    }
    diagonalSum = 0;

    for (int i = 0; i < rows; i++) {
      diagonalSum += array[i][rows - (i + 1)];
    }
    return diagonalSum == sum;
  }
}
