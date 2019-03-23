package com.drbhagwat.CoreJava.Chapter3;

import java.util.List;

public class MySequence implements IntSequence {
  
  public static void main(String[] args) {
	int a[] = IntSequence.of(3, 1, 4, 1, 5, 9);

	for (int v : a) {
		System.out.println(v);  
	}
	
	List<Integer> listOfIntegers = IntSequence.constant(1);

	for (Integer i : listOfIntegers) {
		System.out.println(i);  
	}

  }
}
