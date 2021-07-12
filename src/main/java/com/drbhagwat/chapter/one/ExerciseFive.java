package com.drbhagwat.chapter.one;

import java.util.logging.Logger;

/**
 * What happens when you cast a double (that is larger than the largest possible int value) to an int. Try it out.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-July-12
 */
public class ExerciseFive {
  /**
   * This method prints when you cast a double (that is larger than the largest possible int) to an int.
   *
   * @param args - command-line arguments (none).
   */
  public static void main(String[] args) {
    String message = "The largest double value is " + Double.MAX_VALUE;
    // get the name of the class in a generic way from the current thread instead of hardcoding
    Logger logger = Logger.getLogger(Thread.currentThread().getClass().getName());
    logger.info(message);
    int i = (int) Double.MAX_VALUE;
    message = "The value of an int, when you cast a double larger than the largest possible int is " + i;
    logger.info(message);
    message = "The largest int value is " + Integer.MAX_VALUE;
    logger.info(message);
  }
}
