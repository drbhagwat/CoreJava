package com.drbhagwat.CoreJava.MultiThreading;

public class TobeKilledThread extends Thread {

  private volatile Thread stopMe;

  public TobeKilledThread() {
	stopMe = Thread.currentThread();
	System.out.println("The value of stopMe is " + stopMe);
  }

  public void killCurrentThread() {
	System.out.println("Killing the thread now");
	stopMe = null;
  }

  public void run() {
	System.out.println("The value of stopMe in run method is " + stopMe);

	while (stopMe != null) {

	  for (int i = 0; i < 100; i++) {

		if (i % 2 != 0) {
		  System.out.println(i);
		}
	  }
	}
  }
}
