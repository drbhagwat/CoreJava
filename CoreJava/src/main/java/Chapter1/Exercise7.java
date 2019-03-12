package Chapter1;

import java.util.Scanner;

/* 
 * Write a program that reads in two integers between 0 and 4294967295, 
 * stores them in int variables, and computes and displays their unsigned sum, 
 * difference, product, quotient, and remainder. Do not convert them long
 * values.
 */
public class Exercise7 {

  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.print("Please input two integers separated by a space - both should be between 0 and 4294967295 (both inclusive): ");
	long longValue1 = scanner.nextLong();
	long longValue2 = scanner.nextLong();
	
	while ((longValue1 < 0) || (longValue1 > 4294967295L)) {
		System.out.println("The first integer is not within the range. Please reenter the same: ");
		longValue1 = scanner.nextLong();
	}

	while ((longValue2 < 0) || (longValue2 > 4294967295L)) {
		System.out.println("The second integer is not within the range. Please reenter the same: ");
		longValue2 = scanner.nextLong();
	}

	scanner.close();
	int intValue1 = Integer.parseUnsignedInt(Long.toUnsignedString(longValue1));
	int intValue2 = Integer.parseUnsignedInt(Long.toUnsignedString(longValue2));

	System.out.println("The first integer value is " + intValue1);
	System.out.println("The second integer value is " + intValue2);
	System.out.println("Their sum is " + (intValue1 + intValue2));
	System.out.println("Their difference is " + (intValue1 - intValue2));
	System.out.println("Their product is " + (intValue1 * intValue2));
	System.out.println("Their quotient is " + Integer.divideUnsigned(intValue1, intValue2));
	System.out.println("Their remainder is " + Integer.remainderUnsigned(intValue1, intValue2));
  }
}
