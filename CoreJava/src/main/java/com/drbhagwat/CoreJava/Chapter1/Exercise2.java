package com.drbhagwat.CoreJava.Chapter1;

import java.util.Scanner;

/*
 * Problem Statement:
 *
 * Write a program that reads an integer angle (which may be positive or negative) and normalizes it to a value
 * between 0 and 359 degrees. Try it first with the % operator, then with floorMod.
 */


/**
 * This program reads reads an integer angle (which may be positive or negative) and normalizes it to a value
 * between 0 and 359 degrees. First with the % operator, then with floorMod.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2020-04-01
 */
class Exercise2 {
  public static void main(String args[]) {
    System.out.print("Please input an integer angle (positive or negative): ");

    Scanner scanner = new Scanner(System.in);
    int angle = scanner.nextInt();
    scanner.close();

    angle = (angle %= 360) < 0 ? (angle + 360) : angle;

    System.out.printf("The normalized angle using modulus operator is -> %d\n", angle);
    System.out.printf("The normalized angle using Math.floorMod is -> %d\n", Math.floorMod(angle, 360));
  }
}