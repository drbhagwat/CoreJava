package com.drbhagwat.CoreJava.Chapter1;

import java.math.BigInteger;

/*
 * Problem Statement:
 *
 * Write a program that computes the factorial n! = 1 * 2 * ... * n using BigInteger. Compute the factorial of 1000.
 */

/**
 * This program computes 1000! using BigInteger.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2020-04-07
 */
public class Exercise6 {
  public static void main(String[] args) {
    BigInteger result = BigInteger.ONE;

    for (int i = 2; i <= 1000; i++) {
      result = result.multiply(new BigInteger(Integer.toString(i)));
    }

    System.out.println("1000! using BigIntegers is " + result);
  }
}
