package com.drbhagwat.Chapter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The following program is a solution to Exercise15 of Chapter1.
 * <p>
 * Write a program that stores Pascal's Triangle up to a given n in an Array:ist<ArrayList<Integer>>.
 */
public class Exercise15 {
    /**
     * This method reads stores Pascal's Triangle up to a given n in an Array:ist<ArrayList<Integer>>.
     *
     * @param args - command-line arguments (none).
     */
    public static void main(String[] args) {
        System.out.print("Please input the number of rows in the Pascal's Triangle: ");
        Scanner scanner = new Scanner(System.in);
        String numberOfRows = scanner.nextLine();
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

        for (int row = 0; row < rowCount; row++) {
            ArrayList<Integer> aList = triangle.get(row);

            for (int col = 0; col < aList.size(); col++) {
                System.out.printf("%4d", aList.get(col));
            }
            System.out.println("");

        }
        scanner.close();
    }
}
