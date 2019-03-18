package com.drbhagwat.CoreJava.MultiThreading;

public class Child extends Thread {
  private Parent parent = null;
  
  public Child(Parent parent) {
	this.parent = parent;
  }
  
  public void run() {
	parent.setData("This news is set by the Child");
	
	synchronized(parent) {
	  parent.notify();
	}
  }
}
