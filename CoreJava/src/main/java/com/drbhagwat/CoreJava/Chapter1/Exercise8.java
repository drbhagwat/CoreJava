package com.drbhagwat.CoreJava.Chapter1;

import java.util.Scanner;

/*
 * Write a program that reads a string and prints all of its nonempty substrings.
 */
public class Exercise8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please input a string: ");
    String string = scanner.nextLine();
    scanner.close();
    int len = string.length();
    System.out.println("All non-empty substrings of " + string + " follow:");

    for (int i = 0; i < len ; i++) {

			for (int j = i + 1 ; j <= len; j++) {
				if ( (j - i) == len) {
					System.out.println(string);
				} else {
					String subString = string.substring(i, j);
					int subStringLength = subString.length();
					permute(subString, 0, subStringLength - 1);
				}
			}
    }
  }

  static void permute(String string, int l, int r) {
    int i;

    if (l == r) {
      System.out.println(string);
    } else {

      for (i = l; i <= r; i++) {
				string = swap(string,  l,  i);
				permute(string, l+1, r);
				string = swap(string,l,i);
      }
    }
  }

	/**
	 * Swap Characters at position
	 * @param a string value
	 * @param i position 1
	 * @param j position 2
	 * @return swapped string
	 */
	private static String swap(String a, int i, int j)
	{
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i] ;
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
}
