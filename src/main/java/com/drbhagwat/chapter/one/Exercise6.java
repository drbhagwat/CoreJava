package com.drbhagwat.chapter.one;

import java.math.BigInteger;

/**
 * The following program is a solution to Exercise6 of Chapter1.
 * <p>
 * This program computes 1000! using BigInteger.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-06-02
 */
public class Exercise6 {
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
        System.out.println("1000! using BigIntegers is " + result);
    }
}
