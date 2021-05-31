package com.drbhagwat.Chapter1;

import java.util.Scanner;

/*
 * Problem Statement:
 *
 * Write a program that reads an integer and prints it in binary, octal and hexadecimal. Print the reciprocal as a
 * hexadecimal floating-point number.
 */

/**
 * This program reads an integer and prints it in binary, octal and hexadecimal. It also prints the reciprocal of
 * the same number in the hexadecimal floating-point format.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2020-04-01
 */
class Exercise1 {
  public static void main(String[] args) {
    System.out.print("Please input an integer ->" +
        " ");

    Scanner scanner = new Scanner(System.in);
    int i = scanner.nextInt();

    System.out.printf("The number's binary representation is -> %s,\n" +
            "octal representation is -> %o,\n" +
            "hexadecimal representation is -> %x,\n" +
            "and its reciprocal (in hexadecimal representation) is -> %a\n",
        Integer.toBinaryString(i), i, i, 1.0 / i);

    // As a good practice, close the system resource (when not needed), as they are limited in number
    scanner.close();
  }
}
