package com.drbhagwat.CoreJava.Chapter2;

/* 
 * Implement an immutable class Point that describes a point in the plane. 
 * Provide a constructor to set it to a specific point, a no-arg constructor to
 * set it to the origin, and methods getX, getY, translate, and scale. 
 * The translate method moves the point by a given amount in x- and y- direction.
 * The scale method scales both coordinates by a given factor. Implement these methods 
 * so that they return new points with the results. For example, 
 * Point p = new Point(3,4).translate(1,3).scale(0.5); 
 * should set p to a point with coordinates (2, 3.5) 
 */

class Point {
  private double x;
  private double y;
  
  public Point() {
	x = 0.0;
	y = 0.0;
  }
  
  public Point(double x, double y) {
	this.x = x;
	this.y = y;
  }

  public Point translate(double x, double y) {
	return new Point(this.x + x, this.y + y);
  }

  public Point scale(double scale) {
	return new Point(this.x * scale, this.y * scale);
  }

  @Override
  public String toString() {
	return ("x = " + x + ", y = " + y);
  }

  public static void main(String args[]) { 
	Point p = new Point(3,4).translate(1,3).scale(0.5); 
	System.out.println(p);
  }
}
