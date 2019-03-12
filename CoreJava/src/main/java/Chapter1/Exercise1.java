package Chapter1;

import java.util.Scanner;

/* 
 * Write a program that reads an integer and prints it in binary, 
 * octal and hexadecimal. Print the reciprocal as a hexadecimal 
 * floating-point number. 
 */
class Exercise1 {
  public static void main(String args[]) {
	System.out.print("Please input a number: ");

	Scanner scanner = new Scanner(System.in);
	int i = scanner.nextInt();
	scanner.close();

	System.out.printf(
		"The number's decimal representation is -> %d\nbinary representation is -> %s\noctal representation is -> %o\nhexadecimal representation is -> %x\nand its reciprocal in hexadecimal representation is -> %a\n",
		i, Integer.toBinaryString(i), i, i, 1.0 / i);
  }
}
