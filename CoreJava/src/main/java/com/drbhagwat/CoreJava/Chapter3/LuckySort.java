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
  private static List<String> newArrayList = new ArrayList<>();

  @Override
  public int compare(String o1, String o2) {
	return (o1.compareTo(o2));
  }

  public static void luckySort(List<String> arrayList, Comparator<String> comparator) {
	do {
	  Collections.shuffle(arrayList);
	} while(!isSame(arrayList, newArrayList));
  }

  public static boolean isSame(List<String> arrayList, List<String> newArrayList) {
	int srcLen = arrayList.size();
	int destLen = newArrayList.size();
	
	if (srcLen != destLen) {
	  return false;
	}
		
	for(int i = 0; i < srcLen; i++) {
	  if (! (arrayList.get(i).equals(newArrayList.get(i)))) {
		return false;
	  }
	}
	return true;
  }

  public static void main(String[] args) {
	arrayList.add("dinesh");
	arrayList.add("ganesh");
	arrayList.add("shrimati");
	arrayList.add("rama");
	
	Comparator<String> comparator = (first, second) -> ( first.compareTo(second));
	arrayList.sort(comparator);

	newArrayList.add("1");
	newArrayList.add("2");
	newArrayList.add("3");
	newArrayList.add("4");

	Collections.copy(newArrayList, arrayList);
	luckySort(arrayList, comparator);
  }
}
