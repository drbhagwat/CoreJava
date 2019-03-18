package com.drbhagwat.CoreJava.Chapter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
 * Write a program that stored Pascal's Triangle up to a given n
 * in an Array:ist<ArrayList<Integer>>
 */
public class Exercise15 {
  public static void main(String[] args) {
	List<ArrayList<Integer>> triangle = new ArrayList<ArrayList<Integer>>();

	System.out.print("Please input the number of rows in the Pascal's Triangle: ");

	Scanner scanner = new Scanner(System.in);
	String row = scanner.nextLine();
	int rowCount = Integer.parseInt(row);

	for (int i = 0; i < rowCount; i++) {
	  ArrayList<Integer> aList = new ArrayList<Integer>(i + 1);

	  for (int k = 0; k < i + 1; k++) {
		aList.add(0);
	  }
	  
	  aList.set(0, 1);
	  aList.set(i, 1);
	  triangle.add(i, aList);

	  for (int j = 1; j < i; j++) {
		ArrayList<Integer> previousRow = triangle.get(i - 1);
		aList.set(j, previousRow.get(j - 1) + previousRow.get(j));
	  }
	}

	for (int i = 0; i < rowCount; i++) {
	  ArrayList<Integer> aList = triangle.get(i);

	  for (int c = 0; c < aList.size(); c++) {
		System.out.printf("%4d", aList.get(c));
	  }
	  System.out.println("");

	}
	scanner.close();
  }
}
