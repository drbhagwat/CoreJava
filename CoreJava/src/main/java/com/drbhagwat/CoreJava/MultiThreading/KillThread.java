package com.drbhagwat.CoreJava.MultiThreading;

public class KillThread {
  public static void main(String args[]) {
	TobeKilledThread t1 = new TobeKilledThread();
	t1.setPriority(Thread.MAX_PRIORITY);
	Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
	t1.start();
	
	for(int i = 0; i <100; i++) {
	  System.out.println(i);
	}
	t1.killCurrentThread();
   }
}
