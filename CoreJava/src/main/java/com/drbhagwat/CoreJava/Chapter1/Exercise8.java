package com.drbhagwat.CoreJava.Chapter1;

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
    int len = string.length();
    System.out.println("All non-empty substrings of " + string + " follow:");

    for (int i = 0; i <= len; i++) {
      printCombination(string.toCharArray(), len, i);
    }
  }

  /* arr[]  ---> Input Array
    data[] ---> Temporary array to store current combination
    start & end ---> Staring and Ending indexes in arr[]
    index  ---> Current index in data[]
    r ---> Size of a combination to be printed */
  static void combinationUtil(char arr[], char data[], int start,
                              int end, int index, int r) {
    // Current combination is ready to be printed, print it
    if (index == r) {
      for (int j = 0; j < r; j++)
        System.out.print(data[j] + " ");
      System.out.println();
      return;
    }

    // replace index with all possible elements. The condition
    // "end-i+1 >= r-index" makes sure that including one element
    // at index will make a combination with remaining elements
    // at remaining positions
    for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
      data[index] = arr[i];
      combinationUtil(arr, data, i + 1, end, index + 1, r);
    }
  }

  // The main function that prints all combinations of size r
  // in arr[] of size n. This function mainly uses combinationUtil()
  static void printCombination(char arr[], int n, int r) {
    // A temporary array to store all combination one by one
    char data[] = new char[r];

    // Print all combination using temprary array 'data[]'
    combinationUtil(arr, data, 0, n - 1, 0, r);
  }
}
