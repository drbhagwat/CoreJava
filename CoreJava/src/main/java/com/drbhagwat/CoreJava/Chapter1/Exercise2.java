package com.drbhagwat.CoreJava.Chapter1;

import java.util.Scanner;

/*
 * Write a program that reads an integer angle (which may be positive or
 * negative and normalizes it to a value between 0 and 359 degrees.
 * Try it first with the % operator, then with floorMod.
 */
class Exercise2 {
  public static void main(String args[]) {
    System.out.print("Please input a angle: ");

    Scanner scanner = new Scanner(System.in);
    int angle = scanner.nextInt();
    scanner.close();

    angle %= 360; // first normalize it between 0 and 359
    angle = (angle < 0) ? (angle + 360) : angle;

    System.out.printf("The normalzied angle is -> %d\n", angle);
    System.out.printf("The normalzied angle using Math.floorMod is -> %d\n", Math.floorMod(angle, 360));
  }
}