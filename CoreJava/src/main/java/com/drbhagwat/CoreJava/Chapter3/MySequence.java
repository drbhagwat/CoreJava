package com.drbhagwat.CoreJava.Chapter3;

public class MySequence implements IntSequence {
  int i;

  public static void main(String[] args) {
	int a[] = IntSequence.of(3, 1, 4, 1, 5, 9);

	for (int v : a) {
	  System.out.println(v);
	}
	IntSequence.constant(5);
  }
}
