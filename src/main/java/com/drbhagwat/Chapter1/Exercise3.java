package com.drbhagwat.Chapter1;

import java.util.Scanner;

/*
 * Problem Statement:
 *
 * Using only the conditional operator, write a program that reads three integers and prints the largest. Repeat with
 * Math.max.
 */

/**
 * This program reads three integers and prints the largest. Repeat with Math.max.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2020-04-02
 */
public class Exercise3 {
  public static void main(String[] args) {
    System.out.print("Please input 3 integers (on a single line, separated by white space or on three separate lines)" +
				": ");

    Scanner scanner = new Scanner(System.in);
    int number1 = scanner.nextInt();
    int number2 = scanner.nextInt();
    int number3 = scanner.nextInt();
    scanner.close();

    System.out.println("The three numbers are " + number1 + " " + number2 + " " + number3);

    int greater = (number1 > number2) ? number1 : number2;
    int greatest = (greater > number3) ? greater : number3;
    System.out.println("The largest is " + greatest);

    greater = Math.max(number1, number2);
    greatest = Math.max(number3, greater);

    System.out.println("The largest is " + greatest);
  }
}
