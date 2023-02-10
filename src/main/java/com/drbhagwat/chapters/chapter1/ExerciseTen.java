package com.drbhagwat.chapters.chapter1;

import java.util.Random;
import java.util.logging.Logger;

/**
 * Write a program that produces a random string of letters and digits by generating a random long value and printing
 * it in base 36.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-July-03
 */
public class ExerciseTen {
  /**
   * This method produces a random string of letters and digits by generating a random long value and printing it in
   * base 36.
   *
   * @param args - command-line arguments (none).
   */
  public static void main(String[] args) {
    // get the name of the class in a generic way from the current thread instead of hardcoding
    Logger logger = Logger.getLogger(Thread.currentThread().getClass().getName());
    String message = "A random string of letters and digits is " + Long.toString(new Random().nextLong(), 36);
    logger.info(message);
  }
}