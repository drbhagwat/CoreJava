

import java.util.Scanner;

/* 
 * Write a program that reads a line of text and prints all the characters
 * that are not ASCII together with their Unicode values. 
 */
public class Exercise11 {
  public static void main(String[] args) {
	System.out.print("Please input a string: ");
	Scanner scanner = new Scanner(System.in);
	String string = scanner.nextLine();
	scanner.close();
	int length = string.codePointCount(0, string.length());
	int i = 0;

	while (i < length) {
	  int j = string.offsetByCodePoints(i, 1);
	  String codePoint = string.substring(i, j);
	  char c = codePoint.charAt(0);
	  System.out.println(codePoint);
	  System.out.printf("\\u%04x\n", (int) c);
	  i = j;
	}
  }
}
