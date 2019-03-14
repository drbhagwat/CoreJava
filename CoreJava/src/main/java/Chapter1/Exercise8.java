package Chapter1;

import java.util.Scanner;

/* 
 * Write a program that reads a string and prints all of its nonempty substrings.
 */
public class Exercise8 {

  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Please input a string: ");
	String string = scanner.nextLine();
	scanner.close();
	int n = string.length();
	
	System.out.println("All non-empty substrings follow:");

	for (int i = 1; i <= n; i++) {
	  printCombination(new StringBuffer(string), n, i);
	}
  }

  /*
   * string ---> Input String
   * data ---> Temporary String to store current
   * combination start & end ---> Staring and Ending indexes in string 
   * index ---> Current index in data 
   * r ---> Size of a combination to be printed
   */
  static void combinationUtil(StringBuffer string, StringBuffer data, int start, int end, int index, int r) {
	// Current combination is ready to be printed, print it
	if (index == r) {
	  
	  for (int j = 0; j < r; j++) {
		System.out.print(data.charAt(j));
	  }
	  System.out.println("");
	  return;
	}

	// replace index with all possible elements. The condition
	// "end-i+1 >= r-index" makes sure that including one element
	// at index will make a combination with remaining elements
	// at remaining positions
	for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
	  data.replace(index, i, new String(string.charAt(i) + ""));
	  combinationUtil(string, data, i + 1, end, index + 1, r);
	}
  }

  // The main function that prints all combinations of size r
  // in String arr of size n. This function mainly uses combinationUtil()
  static void printCombination(StringBuffer arr, int n, int r) {
	// A temporary String to store all combination one by one
	StringBuffer data = new StringBuffer(arr);
	// Print all combinations using temporary String data
	combinationUtil(arr, data, 0, n - 1, 0, r);
  }
}
