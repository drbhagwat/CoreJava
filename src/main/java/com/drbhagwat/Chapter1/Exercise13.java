package com.drbhagwat.Chapter1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 * The following program is a solution to Exercise13 of Chapter1.
 * <p>
 * Write a program that prints a lottery combination, picking six distinct numbers between 1 and 49.
 * To pick six distinct numbers, start with an arrraylist filled with 1..49. Pick a random index and
 * remove the element. Repeat six times. Print the result in sorted order.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-06-12
 */
public class Exercise13 {
    /**
     * This method prints a lottery combination, picking six distinct numbers between 1 and 49.
     *
     * @param args - command-line arguments (none).
     */
    public static void main(String[] args) {
        List<Integer> listOfLotteryNumbers = new ArrayList<>();

        for (int i = 1; i <= 49; i++) {
            listOfLotteryNumbers.add(i);
        }
        List<Integer> pickedNumbers = new ArrayList<>();

        for (int i = 0; i <= 5; i++) {
            int randomIndex = new Random().nextInt(48) + 1;
            pickedNumbers.add(listOfLotteryNumbers.remove(randomIndex));
        }
        pickedNumbers.sort(Comparator.comparingInt(i -> i));
        int pickedNumbersSize = pickedNumbers.size();

        for (int i = 0; i < pickedNumbersSize; i++) {
            System.out.println(pickedNumbers.get(i));
        }
    }
}
