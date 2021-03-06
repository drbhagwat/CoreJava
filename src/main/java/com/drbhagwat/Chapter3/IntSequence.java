package com.drbhagwat.Chapter3;

/* 
 * Implements a static of method of the IntSequence class that yields a sequence with the arguments. 
 * For example, IntSequence.of(3, 1, 4, 1, 5, 9) yields a sequence with six values. Extra credit if
 * you return an instance of an anonymous inner class. 
 * Add a static method with the name constant of the IntSequence class that yields an infinite constant
 * sequence. For example, IntSeuqne.constant(1) yields values 1 1 1 ..., ad infinitum. Extra credit if you do this
 * with lambda expression. 
 */
public interface IntSequence {
  public default boolean hasNext() {
	return true;
  }

  public static int next(int i) {
	return i;
  };

  public static int[] of(int... values) {
	int a[] = new int[values.length];

	IntSequence intSequence = new IntSequence() {
	  {
		int i = 0;

		for (int v : values) {
		  a[i++] = v;
		}
	  }
	};
	return a;
  }

  public static void constant(int i) {
	for(;;) {
	  System.out.println(next(i));
	}
  }
}
