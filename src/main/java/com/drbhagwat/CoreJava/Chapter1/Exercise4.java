package com.drbhagwat.CoreJava.Chapter1;


/*
 * Problem Statement:
 *
 * Write a program that prints the smallest and largest positive double values: Hint: Lookup Math.nextUp in the Java
 * API.
 */

/**
 * This program prints the smallest and largest positive double values: Hint: Lookup Math.nextUp in the Java API.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2020-04-02
 */
public class Exercise4 {
  public static void main(String[] args) {
    System.out.println("The smallest double value is " + Math.nextUp(0.0));
    System.out.println("The smallest double value is " + Double.MIN_VALUE);

    System.out.println("The largest double value is " + Double.MAX_VALUE);
    System.out.println("The largest double value is " + Double.POSITIVE_INFINITY);
  }
}