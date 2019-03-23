package com.drbhagwat.CoreJava.Chapter3;

import java.math.BigInteger;

/* 
 * The SquareSequence class doesn't actually deliver an infinite sequence of squares due to integer overflow.
 * Specifically how does it behave? Fix the problem by defining a Sequence<T> interface and a 
 * SquareSequence class that implements Sequence<BigInteger>
 */
public class SquareSequence implements Sequence<BigInteger> {
  private static BigInteger bi = BigInteger.ZERO;

 @Override
  public BigInteger next() {
   bi = bi.add(BigInteger.ONE);
   return bi.multiply(bi);
  }
  
  public static void main(String[] args) {
	SquareSequence squareSequence = new SquareSequence();
	System.out.println(squareSequence.hasNext());
	
	for (; ; ) {
	  System.out.println(squareSequence.next());
	}
  }
}
