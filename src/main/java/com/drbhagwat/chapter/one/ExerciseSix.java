package com.drbhagwat.chapter.one;

import java.math.BigInteger;
import java.util.logging.Logger;

/**
 * This program computes 1000! using BigInteger.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-June-25
 */
public class ExerciseSix {
  /**
   * This method computes 1000! using BigInteger.
   *
   * @param args - command-line arguments (none).
   */
  public static void main(String[] args) {
    var logger = Logger.getLogger(Thread.currentThread().getClass().getName());

    BigInteger result = BigInteger.ONE;

    for (var i = 2; i <= 1000; i++) {
      result = result.multiply(new BigInteger(Integer.toString(i)));
    }
    var message = "1000! using BigIntegers is " + result;
    logger.info(message);
  }
}
