package com.drbhagwat.chapters.two;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/* 
 * In the RandomNumbers class, provide two static methods randomElement that get a 
 * random element from an array or array list of integers (Return 0 if the array or
 * arrayList is empty). Why couldn't you make these methods into instance methods 
 * of int[] or ArrayList<Intger>
 */
class RandomNumbers {
  private static Random generator = new Random();
  private static int [] intArray = {1, 2, 3};
  private static List<Integer> list = Arrays.asList(1, 2, 3);
  
  public static int nextInt(int low, int high) {
	return low + generator.nextInt(high - low + 1);
  }
  
  public static int randomElement(int[] intArray) {
	int arrayLength = intArray.length;
	return (arrayLength == 0) ? 0 : nextInt(0, arrayLength);
  }

  public static Integer randomElement(List<Integer> list) {
	int listLength = list.size();
	return (listLength == 0) ? 0 : nextInt(0, listLength);
  }

  public static void main(String args[]) { 
	System.out.println(RandomNumbers.randomElement(intArray));
	System.out.println(RandomNumbers.randomElement(list));
  }
}
