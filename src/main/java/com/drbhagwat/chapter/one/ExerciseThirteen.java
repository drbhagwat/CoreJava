package com.drbhagwat.chapter.one;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

/**
 * Write a program that prints a lottery combination, picking six distinct numbers between 1 and 49. To pick six
 * distinct numbers, start with an arraylist filled with 1..49. Pick a random index and remove the element. Repeat
 * six times. Print the result in sorted order.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-July-01
 */
public class ExerciseThirteen {
  /**
   * This method prints a lottery combination, picking six distinct numbers between 1 and 49.
   *
   * @param args - command-line arguments (none).
   */
  public static void main(String[] args) {
    final int TOTAL_NUMBER_OF_NUMBERS = 49;
    final int NUMBERS_TO_PICK = 6;
    // get the name of the class in a generic way from the current thread instead of hardcoding
    Logger logger = Logger.getLogger(Thread.currentThread().getClass().getName());

    List<Integer> listOfLotteryNumbers = new ArrayList<>();

    for (int i = 0; i < TOTAL_NUMBER_OF_NUMBERS; i++) {
      listOfLotteryNumbers.add(i);
    }
    List<Integer> pickedNumbers = new ArrayList<>();

    for (int i = 0; i < NUMBERS_TO_PICK; i++) {
      pickedNumbers.add(listOfLotteryNumbers.get(new Random().nextInt(TOTAL_NUMBER_OF_NUMBERS)));
    }
    pickedNumbers.sort(Comparator.comparingInt(i -> i));
    int pickedNumbersSize = pickedNumbers.size();

    for (int i = 0; i < pickedNumbersSize; i++) {
      String message = pickedNumbers.get(i).toString();
      logger.info(message);
    }
  }
}
