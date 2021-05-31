package com.drbhagwat.CoreJava.MultiThreading;

public class EvenRunnable implements Runnable {

  public void run() {

	for (int i = 0; i < 100; i++) {

	  if (i % 2 == 0) {
		System.out.println(i + " from Even Runnable");
		
		// note that I cannot put a sleep() here; I have introduced the delay programmatically.
		for(int j = 0; j <= 10000; j++);
	  }
	}
  }
}
