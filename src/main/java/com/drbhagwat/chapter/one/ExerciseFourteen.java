package com.drbhagwat.chapter.one;

import java.util.Scanner;

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
 * @since : 2021-July-03
 */

public class ExerciseFourteen {
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

    System.out.print("Please input rows one after the other (separate elements within a row by a white space), " +
        "followed by a blank-line to end your input: ");

    Scanner scanner = new Scanner(System.in);
    int rowCount = 0;

    while (scanner.hasNextLine()) {
      String row = scanner.nextLine();

      // check if the line is a blank line
      if ("".equals(row.trim())) {
        System.out.println(isMagicSquare(array));
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
    scanner.close();
  }

  /**
   * @param array - two dimensional array
   * @return the array has equal number osf rows and columns (square) or not
   */
  private static boolean isTheMatrixASquare(int[][] array) {
    int rows = getNumberOfRows(array);

    // For each row, check if the number of columns is the same
    // as the total number of rows
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
   * @return - true if the given two dimensional array is a magic square, false otherwise.
   */
  private static boolean isMagicSquare(int[][] array) {
    if (!isTheMatrixASquare(array)) {
      return false;
    }
    int rows = getNumberOfRows(array);
    int savedRowSum = 0;

    for (int i = 0; i < rows; i++) {
      // reset the rowSum for each row
      int rowSum = 0;

      // keep accumulating each row
      for (int j = 0; j < array[i].length; j++) {
        rowSum += array[i][j];
      }

      // save the sum only once
      if (i == 0) {
        savedRowSum = rowSum;
      } else {
        if (rowSum != savedRowSum) {
          return false;
        }
      }
    }

    for (int col = 0; col < rows; col++) {
      // reset the columnSum for each column
      int columnSum = 0;

      for (int row = 0; row < rows; row++) {
        columnSum += array[row][col];
      }

      if (columnSum != savedRowSum) {
        return false;
      }
    }
    int diagonalSum = 0;

    for (int i = 0; i < rows; i++) {
      diagonalSum += array[i][i];
    }

    if (diagonalSum != savedRowSum) {
      return false;
    }
    diagonalSum = 0;

    for (int i = 0; i < rows; i++) {
      diagonalSum += array[i][rows - (i + 1)];
    }
    return diagonalSum == savedRowSum;
  }
}
