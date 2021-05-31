package com.drbhagwat.CoreJava.Chapter3;

/* 
 * Write a method that takes an array of Runnable instances and returns a runnable whose run method 
 * executes them in order. Return a lambda expression.
 */
public class Exercise14 {

  public static Runnable runInOrder(Runnable [] runnableArray) {

	Runnable task = () -> {
	  for (int i = 0; i < runnableArray.length; i++) {
		  runnableArray[i].run();
		}
	  };
	return task;
  }

  public static void main(String[] args) {
	Runnable [] runnableArray = new Runnable[2];
	
	runnableArray[0] = () -> System.out.println("Task1 is running");
	runnableArray[1] = () -> System.out.println("Task2 is running");
	new Thread(runInOrder(runnableArray)).start();
  }
}
