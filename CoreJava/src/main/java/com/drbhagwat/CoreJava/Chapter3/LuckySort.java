package com.drbhagwat.CoreJava.Chapter3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* 
 * Implement the method void luckySort(ArrayList<String>, Comparator<String> comp) that keeps
 * calling Collections.shuffle on the array list until the elements are in increasing order, as 
 * determined by the comparator. 
 */
public class LuckySort implements Comparator<String> {

  private static List<String> arrayList = new ArrayList<>();

  @Override
  public int compare(String o1, String o2) {
	return (o1.compareTo(o2));
  }

  public static void luckySort(List<String> arrayList, Comparator<String> comparator) {
	arrayList.sort(comparator);
  }

  public static void main(String[] args) {
	arrayList.add("dinesh");
	arrayList.add("ganesh");
	arrayList.add("shrimati");
	arrayList.add("rama");
	Comparator<String> comparator = (first, second) -> ( first.compareTo(second));
	
	luckySort(arrayList, comparator);
	
  }
}
