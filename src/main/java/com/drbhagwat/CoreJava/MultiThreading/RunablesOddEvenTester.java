package com.drbhagwat.CoreJava.MultiThreading;

public class RunablesOddEvenTester {

  public static void main(String args[]) {
	Runnable r1 = new OddRunnable();
	Runnable r2 = new EvenRunnable();

	Thread t1 = new Thread(r1);
	Thread t2 = new Thread(r2);
	
	t1.start();
	t2.start();
  }
}
