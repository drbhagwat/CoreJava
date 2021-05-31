package com.drbhagwat.MultiThreading;

public class KillOddThread {
  public static void main(String args[]) {
	TobeKilledOddThread t1 = new TobeKilledOddThread();

	t1.setPriority(Thread.MAX_PRIORITY);

	Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
	t1.start();
	
	for (int i = 0; i < 100; i++) {
	  System.out.println(i + " printed from the Main Thread");
	}
	t1.kill();
  }
}
