package com.drbhagwat.chapters.chapter1;

import java.util.logging.Logger;

/**
 * Improve the average method so that it is called with at least one parameter.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-July-04
 */
public class ExerciseSixteen {

  /**
   * This method improves the average method so that it is called with at least one parameter.
   *
   * @param args - command-line arguments (none).
   */
  public static void main(String[] args) {
    // get the name of the class in a generic way from the current thread instead of hardcoding
    Logger logger = Logger.getLogger(Thread.currentThread().getClass().getName());
    double[] a = {1.0, 2.0};
    String message = Double.toString(average(a));
    logger.info(message);
  }

  /**
   * @param a - one dimensional array of doubles (can be empty)
   * @return - average of all the doubles in the array
   */
  private static double average(double[] a) {
    int len = a.length;

    if (len == 0) {
      return 0.0;
    }
    double sum = 0.0;

    for (double v : a) {
      sum += v;
    }
    return sum / len;
  }
}
