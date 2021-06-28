package com.drbhagwat.chapter.one;

import java.util.Random;

/**
 * Write a program that produces a random string of letters and digits by
 * generating a random long value and printing it in base 36.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-06-10
 */
public class ExerciseTen {
  /**
   * This method produces a random string of letters and digits by generating a random long value and printing it in
   * base 36.
   *
   * @param args - command-line arguments (none).
   */
  public static void main(String[] args) {
    System.out.println("A random string of letters and digits is " +
        Long.toString(new Random().nextLong(), 36));
  }
}