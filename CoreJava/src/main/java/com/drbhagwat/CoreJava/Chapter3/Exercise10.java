package com.drbhagwat.CoreJava.Chapter3;

/* 
 * Implement methods:
 * 
 * public static void runTogether(Runnable... tasks)
 * public static void runInOrder(Runnable... tasks)
 * 
 * The first method should run each task in a separate thread and then return. 
 * The second method should run all methods in the current thread and return when the last one has 
 * completed. 
 */
public class Exercise10 {

  public static void runTogether(Runnable... tasks) {

	for (int i = 0; i < tasks.length; i++) {
	  new Thread(tasks[i]).start();
	}
  }

  public static void runInOrder(Runnable... tasks) {
	tasks[0].run();
	tasks[1].run();
  }

  public static void main(String[] args) {
	System.out.println("main thread");
	Runnable run1 = () -> System.out.println("Task1 is running");
	Runnable run2 = () -> System.out.println("Task2 is running");
	runTogether(run1, run2);
	runInOrder(run1, run2);
  }
}
