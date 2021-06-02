package com.drbhagwat.Chapter1;


/**
 * The following program is a solution to Exercise4 of Chapter1.
 * <p>
 * Write a program that prints the smallest and largest positive double values: Hint: Lookup Math.nextUp in the Java
 * API.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-06-02
 */
public class Exercise4 {
    /**
     * This method prints the smallest and largest positive double values.
     * We know that Zero (0.0) is neither positive nor negative mathematically. I have used nextUp()
     * on 0.0 to get the smallest positive double value. Similarly, Java has a pre-defined constant Double.MAX_VALUE
     * and nextUp() is used on this to get the largest positive double value.
     *
     * @param args - command-line arguments (none).
     */
    public static void main(String[] args) {
        System.out.println("The smallest double value is " + Math.nextUp(0.0));
        System.out.println("The largest double value is " + Math.nextUp(Double.MAX_VALUE));
    }
}