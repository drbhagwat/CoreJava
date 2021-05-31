package com.drbhagwat.Chapter1;

import java.util.Random;

/*
 * Problem Statement:
 *
 * Write a program that produces a random string of letters and digits by
 * generating a random long value and printing it in base 36.
 */

/**
 * Write a program that produces a random string of letters and digits by
 * generating a random long value and printing it in base 36.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2020-04-14
 */
public class Exercise10 {
  public static void main(String[] args) {
    System.out.println("A random string of letters and digits is " +
        Long.toString(new Random().nextLong(), 36));
  }
}