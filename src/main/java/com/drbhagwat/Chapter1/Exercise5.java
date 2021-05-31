package com.drbhagwat.Chapter1;


/*
 * Problem Statement:
 *
 * What happens when you cast a double (that is larger than the largest possible int value) to an int. Try it out.
 */

/**
 * This program prints when you cast a double (that is larger than the largest possible int) to an int.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2020-04-07
 */
public class Exercise5 {
  public static void main(String[] args) {
    int i = (int) Double.MAX_VALUE;

    System.out.println("The largest double value is " + Double.MAX_VALUE);
    System.out.println("The value of an int, when you cast a double larger than the largest possible int is " + i);
    System.out.println("The largest int value is " + Integer.MAX_VALUE);
  }
}
