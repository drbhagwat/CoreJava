package Chapter1;

import java.util.Random;

/* 
 * Write a program that produces a random string of letters and digits by
 * generating a random long value and printing it in base 36.
 */
public class Exercise10 {
  public static void main(String[] args) {
	System.out.println("A ranom string of letters and digits is" + Long.toString(new Random().nextLong(),36));
  }
}
