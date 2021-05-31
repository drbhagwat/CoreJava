package com.drbhagwat.CoreJava.MultiThreading;

public class Parent {
  private String news;

  public static void main(String[] args) {
	Parent parent = new Parent();
	spawnChildThread(parent);
	System.out.println(parent.getNews());
  }

  public static void spawnChildThread(Parent parent) {
	Child child = new Child(parent);
	child.start();

	synchronized (parent) {
	  try {
		parent.wait(100000);
	  } catch (InterruptedException e) {
		e.printStackTrace();
	  }
	}
  }

  public void setData(String news) {
	this.news = news;
  }

  public String getNews() {
	return news;
  }
}
