package com.drbhagwat.Chapter2;

import java.util.concurrent.CopyOnWriteArrayList;

/* 
 * Implement a class Queue, an unbounded queue of strings. Provide methods add, adding at the
 * tail, and remove, removing at the head of the queue. Stored elements as a linked list of 
 * nodes. Make node a nested class. Should it be static or not?
 * Provide an iterator, an object that yields the elements of the queue in turn - for the 
 * queue of this preceding class. Provide a method iterator() of the Queue class that yields
 * a Queue.Iterator. Should Iterator be static or not?
 */
public class Queue {
  private static class Node {
	private String string;

	public Node(String string) {
	  this.string = string;
	}

	@Override
	public String toString() {
	  String str = string;
	  return str;
	}
  }

  private static class MyIterator {
	public java.util.Iterator<Node> getIterator() {
	  return nodes.iterator();
	}

	public Node next() {
	  return getIterator().next();
	}

	public boolean hasNext() {
	  return getIterator().hasNext();
	}
  }

  public void add(String string) {
	Node node = new Node(string);
	nodes.add(node);
  }

  public void remove() {
	nodes.remove(0);
  }

  private static CopyOnWriteArrayList<Node> nodes = new CopyOnWriteArrayList<>();
  private static java.util.Iterator<Node> iterator = null;

  @Override
  public String toString() {
	String str = "";

	for (Node node : nodes) {
	  str += node.toString();
	}
	return str;
  }

  public static void main(String args[]) {
	Queue queue = new Queue();
	queue.add("Dinesh");
	queue.add("Vasanti");
	
	Queue.iterator = new MyIterator().getIterator();
	java.util.Iterator<Node> iterator = Queue.iterator;
	
	while(iterator.hasNext()) {
	  Node node  = iterator.next();
	  System.out.println(node);
	}
  }
}
