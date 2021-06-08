package com.drbhagwat.Chapter1;

import java.util.Random;

/**
 * The following program is a solution to Exercise10 of Chapter1.
 * <p>
 * Write a program that produces a random string of letters and digits by
 * generating a random long value and printing it in base 36.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-06-08
 */
public class Exercise10 {
    /**
     * This method produces a random string of letters and digits by
     * generating a random long value and printing it in base 36.
     *
     * @param args - command-line arguments (none).
     */
    public static void main(String[] args) {
        System.out.println("A random string of letters and digits is " +
                Long.toString(new Random().nextLong(), 36));
    }
}