package com.drbhagwat.CoreJava.Chapter1;

import java.util.Scanner;

/*
 * Problem Statement:
 *
 * Write a program that reads a line of text and prints all the characters
 * that are not ASCII together with their Unicode values.
 */

/**
 * Write a program that that reads a line of text and prints all the characters
 * that are not ASCII together with their Unicode values.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2020-04-16
 */
public class Exercise11 {
  public static void main(String[] args) {
    System.out.print("Please input a string: ");
    Scanner scanner = new Scanner(System.in);
    String string = scanner.nextLine();
    scanner.close();

    int length = string.codePointCount(0, string.length());
    int i = 0;

    System.out.println("This program prints non-ASCII characters together " +
        "with their Unicode values");

    while (i < length) {
      int j = string.offsetByCodePoints(i, 1);
      String codePoint = string.substring(i, j);
      char c = codePoint.charAt(0);

      if (c > 127) {
        System.out.println(codePoint);
        System.out.printf("\\u%04x\n", (int) c);
      }
      i = j;
    }
  }
}
