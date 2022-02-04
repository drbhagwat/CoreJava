package com.drbhagwat.Chapter3;

/* 
 * Implement a class Greeter that implements Runnable and whose run method prints n copies of 
 * "Hello, " + target, where n and target are set in the constructor. 
 * Construct two instances with different messages and execute them concurrently 
 * in two threads. 
 */
public class Greeter implements Runnable {
  private String message;
  private int numberOfCopies;
  
  public Greeter(String message, int numberOfCopies) {
	this.message = message;
	this.numberOfCopies = numberOfCopies;
  }
  
  @Override
  public void run() {
	for (int i = 0; i < numberOfCopies; i++) {
	  System.out.println("Hello, " + message);
	}
  }

  public static void main(String[] args) {
	Greeter greeter1 = new Greeter("Dinesh", 2);
	Greeter greeter2 = new Greeter("Bhagwat", 3);
	
	Thread thread1 = new Thread(greeter1);
	Thread thread2 = new Thread(greeter2);
	
	thread1.start();
	thread2.start();
  }
}
