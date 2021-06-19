package com.drbhagwat.chapter.one;

/**
 * The following program is a solution to Exercise16 of Chapter1.
 * <p>
 * Improve the average method so that it is called with at least one parameter.
 */
public class Exercise16 {
    /**
     * This method improves the average method so that it is called with at least one parameter.
     *
     * @param args - command-line arguments (none).
     */
    public static void main(String[] args) {
        double[] a = {1.0, 2.0};
        System.out.println(average(a));
    }

    /**
     * @param a - one dimensional array of doubles (can be empty)
     * @return - average of all the doubles in the array
     */
    private static double average(double []a) {
        int len = a.length;

        if (len == 0) {
            return 0.0;
        }
        var sum = 0.0;

        for (double v : a) {
            sum += v;
        }
        return sum / len;
    }
}
