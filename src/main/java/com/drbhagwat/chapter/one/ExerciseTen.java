package com.drbhagwat.chapter.one;

import java.util.Random;
import java.util.logging.Logger;

/**
 * Write a program that produces a random string of letters and digits by
 * generating a random long value and printing it in base 36.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-June-28
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
    var logger = Logger.getLogger(Thread.currentThread().getClass().getName());
    var message = "A random string of letters and digits is " + Long.toString(new Random().nextLong(), 36);
    logger.info(message);
  }
}