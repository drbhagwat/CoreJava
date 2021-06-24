package com.drbhagwat.chapter.one;

import java.util.logging.Logger;

/**
 * What happens when you cast a double (that is larger than the largest possible int value) to an int. Try it out.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-June-24
 */
public class ExerciseFive {
  /**
   * This method prints when you cast a double (that is larger than the largest possible int) to an int.
   *
   * @param args - command-line arguments (none).
   */
  public static void main(String[] args) {
    var logger = Logger.getLogger(Thread.currentThread().getClass().getName());
    var message = "The largest double value is " + Double.MAX_VALUE;
    logger.info(message);

    int i = (int) Double.MAX_VALUE;

    message = "The value of an int, when you cast a double larger than the largest possible int is " + i;
    logger.info(message);

    message = "The largest int value is " + Integer.MAX_VALUE;
    logger.info(message);
  }
}
