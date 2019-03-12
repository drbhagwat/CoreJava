package Chapter1;

import java.math.BigInteger;

/* 
 * Write a program that computes the factorial n! = 1 * 2 * ... * n
 * using BigInteger. Compute the factorial of 1000.
 */
public class Exercise6 {

  public static void main(String[] args) {
	BigInteger result = new BigInteger("1");

	for (int i = 1; i <= 1000; i++) {
	  result = result.multiply(new BigInteger(Integer.toString(i)));
	}
	System.out.println("The result is " + result);
  }
}
