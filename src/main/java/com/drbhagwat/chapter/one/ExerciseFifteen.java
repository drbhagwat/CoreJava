package com.drbhagwat.chapter.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Write a program that stores Pascal's Triangle up to a given n.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-July-04
 */
public class ExerciseFifteen {
  /**
   * This method stores Pascal's Triangle up to a given n in an ArrayList<ArrayList<Integer>>.
   *
   * @param args - command-line arguments (none).
   */
  public static void main(String[] args) {
    // get the name of the class in a generic way from the current thread instead of hardcoding
    Logger logger = Logger.getLogger(Thread.currentThread().getClass().getName());
    logger.info("Please input the number of rows in the Pascal's Triangle: ");
    Scanner scanner = new Scanner(System.in);
    String numberOfRows = scanner.nextLine();
    scanner.close(); // close the system resource once done. System resources are limited in number * best practice
    int rowCount = Integer.parseInt(numberOfRows);
    List<ArrayList<Integer>> triangle = new ArrayList<>();

    for (int row = 0; row < rowCount; row++) {
      ArrayList<Integer> aList = new ArrayList<>(row + 1);

      for (int k = 0; k <= row; k++) {
        aList.add(k, 1);
      }

      for (int j = 1; j < row; j++) {
        ArrayList<Integer> previousRow = triangle.get(row - 1);
        aList.set(j, previousRow.get(j - 1) + previousRow.get(j));
      }
      triangle.add(aList);
    }
    String message = "";

    StringBuilder stringBuilder = new StringBuilder("");

    for (int row = 0; row < rowCount; row++) {
      ArrayList<Integer> aList = triangle.get(row);

      stringBuilder.append('\n');
      for (int col = 0; col < aList.size(); col++) {
        message = String.format("%4d", aList.get(col));
        stringBuilder.append(message);
      }
      stringBuilder.append('\n');
    }
    message = stringBuilder.toString();
    logger.info(message);
  }
}
