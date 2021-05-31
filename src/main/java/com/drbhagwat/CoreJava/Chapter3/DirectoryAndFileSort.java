package com.drbhagwat.CoreJava.Chapter3;

import java.io.File;
import java.util.Arrays;

/* 
 * Given an array of File objects, sort it so that directories come before files, and 
 * within each group, elements are sorted by path name. Use a lambda expression to
 * specify the comparator. 
 */
public class DirectoryAndFileSort {

  public static void main(String[] args) {

	if (args.length != 1) {
	  System.out.println("Usage DirectoryAndFileSort <directory>");
	}
	File dir = new File(args[0]);
	File[] files = dir.listFiles();

	Arrays.sort(files, (f1, f2) -> {
	  if (f1.isDirectory() && !f2.isDirectory()) {
		return -1;
	  } else if (!f1.isDirectory() && f2.isDirectory()) {
		return 1;
	  } else {
		return f1.compareTo(f2);
	  }
	});

	for (File f : files) {
	  System.out.println(f);
	}
  }
}
