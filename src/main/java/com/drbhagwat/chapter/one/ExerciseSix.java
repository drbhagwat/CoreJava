package com.drbhagwat.chapter.one;

import java.math.BigInteger;
import java.util.logging.Logger;

/**
 * This program computes 1000! using BigInteger.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-July-12
 */
public class ExerciseSix {
  /**
   * This method computes 1000! using BigInteger.
   *
   * @param args - command-line arguments (none).
   */
  public static void main(String[] args) {
    BigInteger result = BigInteger.ONE;

    for (int i = 2; i <= 1000; i++) {
      result = result.multiply(new BigInteger(Integer.toString(i)));
    }
    String message = "1000! using BigIntegers is " + result;
    // get the name of the class in a generic way from the current thread instead of hardcoding
    Logger logger = Logger.getLogger(Thread.currentThread().getClass().getName());
    logger.info(message);
  }
}
