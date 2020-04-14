package com.drbhagwat.CoreJava.Chapter1;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Problem Statement:
 *
 * Write a program that reads a string and prints all of its substrings.
 */

/**
 * This program reads a string and prints all of its substrings.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2020-04-11
 */
public class Exercise8 {
  // define a static member variable to store the user input, so it can be in any of the helper methods.
  private static String string;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please input a string: ");
    string = scanner.nextLine();
    scanner.close();
    int len = string.length();
    System.out.println("All substrings of " + string + " follow:");

    for (int i = 0; i <= len; i++) {
      generate(len, i);
    }
  }

  private static void generate(int n, int r) {
    helper(new char[r], 0, n - 1, 0);
  }

  private static void helper(char []data, int start, int end, int index) {
    if (index == data.length) {
      System.out.println(Arrays.toString(data));
    } else {

      if (start <= end) {
        data[index] = string.charAt(start);
        helper(data, start + 1, end, index + 1);
        helper(data, start + 1, end, index);
      }
    }
  }
}

