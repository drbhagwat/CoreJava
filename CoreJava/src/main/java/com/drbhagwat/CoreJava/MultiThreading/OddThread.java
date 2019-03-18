package com.drbhagwat.CoreJava.MultiThreading;

public class OddThread extends Thread {

  public void run() {
	for (int i = 0; i < 100; i++) {

	  if (i % 2 != 0) {
		System.out.println(i + " from odd thread");
	  }
	  
	  try {
		sleep(1);
	  } catch (InterruptedException e) {
		e.printStackTrace();
	  }
	}
  }
}
