package com.drbhagwat.CoreJava.Chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * Write a program that reads a string and prints all of its nonempty substrings.
 */
public class Exercise8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please input a string: ");
    String string = scanner.nextLine();
    scanner.close();
    int len = string.length();
    System.out.println("All non-empty substrings of " + string + " follow:");

    for (int i = 0; i <= len; i++) {
      List<int[]> combinations = generate(len, i);

      for (int[] combination : combinations) {
        System.out.println(Arrays.toString(combination));
      }
    }
  }

  private static List<int[]> generate(int n, int r) {
    List<int[]> combinations = new ArrayList<>();
    helper(combinations, new int[r], 0, n - 1, 0);
    return combinations;
  }

  private static void helper(List<int[]> combinations, int data[], int start, int end, int index) {

    if (index == data.length) {
      int[] combination = data.clone();
      combinations.add(combination);
    } else {

      if (start <= end) {
        data[index] = start;
        helper(combinations, data, start + 1, end, index + 1);
        helper(combinations, data, start + 1, end, index);
      }
    }
  }
}

