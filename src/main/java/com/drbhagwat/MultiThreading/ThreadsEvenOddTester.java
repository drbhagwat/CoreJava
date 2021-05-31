package com.drbhagwat.MultiThreading;

public class ThreadsEvenOddTester {

  public static void main(String args[]) {
	System.out.println("Note the switching of threads by the JVM and hence the output from two threads is interleaved");
	Thread t1 = new EvenThread();
	Thread t2 = new OddThread();

	t1.start();
	t2.start();
  }
}
