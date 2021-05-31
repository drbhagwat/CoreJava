package com.drbhagwat.CoreJava.Chapter1;

import java.util.Scanner;

/*
 * Write a program that reads a two dimensional array of integers and
 * determines whether it is a magic square (that is, whether the sum of all
 * rows, all columns, and the diagonals is the same).
 * Accept lines of input that you break up into individual integers, and stop
 *  when the user enters a blank line. For example with the input:
 * 16 3 2 13
 * 5 10 11 8
 * 9 6 7 12
 * 4 15 14 1
 * (Blank line)
 * your program should respond affirmatively.
 */

/**
 * Write Write a program that reads a two dimensional array of integers and
 * determines whether it is a magic square (that is, whether the sum of all
 * rows, all columns, and the diagonals is the same). Accept lines of input that
 * you break up into individual integers, and stop when the user enters a blank
 * line. For example with the input: 16 3 2 12 5 10 11 8 9 6 7 12 4 15 14 1
 * (Blank line) your program should respond affirmatively.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2020-04-16
 */

public class Exercise14 {
  public static void main(String[] args) {
    /*
     * Allocate 100 rows (otherwise, you have to ask the user to
     * enter the number of rows in the magic square) I do not have to
     * allocate the second dimension for the array; it will be decided later
     */
    int[][] array = new int[100][];

    System.out.print(
        "Please input rows one after the other (separate elements " +
            "within a row by a white space), followed by a blank-line " +
            "to end your input: ");

    Scanner scanner = new Scanner(System.in);
    int rowCount = 0;

    while (scanner.hasNextLine()) {
      String row = scanner.nextLine();

      // check if the line is a blank line
      if ("".equals(row.trim())) {
        System.out.println(isMagicSqaure(array));
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

  /*
   * Given a two dimensional array, check if it is a square. Returns false if
   * it is not a square; otherwise returns true.
   */
  private static boolean isASquare(int[][] array) {
    int rows = getNumberOfRows(array);

    // For every row, check if the number of columns is the same as the total
    // number of rows
    for (int i = 0; i < rows; i++) {
      if (array[i].length != rows) {
        return false;
      }
    }
    return true;
  }

  /*
   * Given a two dimensional array, returns the number of rows - could be 0.
   */
  private static int getNumberOfRows(int[][] array) {
    int rows = 0;

    // calculate the total number of rows
    while (array[rows] != null) {
      rows++;
    }
    return rows;
  }

  private static boolean isMagicSqaure(int[][] array) {
    if (!isASquare(array)) {
      return false;
    }
    int rows = getNumberOfRows(array);

    int saveRowSum = 0;

    for (int i = 0; i < rows; i++) {
      // reset the rowSum for each row
      int rowSum = 0;

      // keep accumulating each row
      for (int j = 0; j < array[i].length; j++) {
        rowSum += array[i][j];
      }

      // save the sum only once
      if (i == 0) {
        saveRowSum = rowSum;
      } else {
        if (rowSum != saveRowSum) {
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

      if (columnSum != saveRowSum) {
        return false;
      }
    }

    int diagonalSum = 0;

    for (int i = 0; i < rows; i++) {
      diagonalSum += array[i][i];
    }

    if (diagonalSum != saveRowSum) {
      return false;
    }

    diagonalSum = 0;

    for (int i = 0; i < rows; i++) {
      diagonalSum += array[i][rows - (i + 1)];
    }

    if (diagonalSum != saveRowSum) {
      return false;
    }
    return true;
  }
}
