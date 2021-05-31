package com.drbhagwat.Chapter1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/*
 * Problem Statement:
 *
 * Write a program that a lottery combination, picking six distinct numbers
 * between 1 and 49. To pick six distinct numbers, start with an arrraylist
 * filled with 1..49. Pick a random index and remove the element. Repeat six
 * times. Print the result in sorted order.
 */

/**
 * Write a program that prints a lottery combination, picking six distinct
 * numbers between 1 and 49. To pick six distinct numbers, start with an
 * arrraylist filled with 1..49. Pick a random index and remove the element.
 * Repeat six times. Print the result in sorted order.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2020-04-16
 */
public class Exercise13 {
  public static void main(String[] args) {
    List<Integer> listOfLotteryNumbers = new ArrayList<>();
    List<Integer> pickedNumbers = new ArrayList<>();

    for (int i = 1; i <= 49; i++) {
      listOfLotteryNumbers.add(i);
    }

    for (int j = 0; j <= 5; j++) {
      int randomindex = new Random().nextInt(48) + 1;
      pickedNumbers.add(listOfLotteryNumbers.remove(randomindex));
    }

    pickedNumbers.sort(Comparator.comparingInt(i -> i));

    int size = pickedNumbers.size();

    for (int i = 0; i < size; i++) {
      System.out.println(pickedNumbers.get(i));
    }
  }
}