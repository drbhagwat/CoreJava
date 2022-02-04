package com.drbhagwat.Chapter3;

import java.io.File;
import java.io.FileFilter;

/* 
 * Using the listFiles(FileFilter) and isDirectory method of the java.io.File class, 
 * write a method that returns all sub directories of a given directory,. Use a lambda 
 * expression instead of a FileFilter object. Repeat with a method expression and an 
 * anonymous inner class. 
 */
public class ListSubDir {

  public static void main(String[] args) {

	if (args.length != 1) {
	  System.out.println("Usage ListSubDir <directory>");
	}
	File dir = new File(args[0]);
	File[] files = dir.listFiles((file) -> file.isDirectory());

	for (File f : files) {
	  System.out.println(f.getAbsolutePath());
	}

	System.out.println("Same functionality is implmented below, using method expression and anonymous inner class");

	files = new File(args[0]).listFiles(new FileFilter() {
	  @Override
	  public boolean accept(File f) {
		return f.isDirectory();
	  }
	});

	for (File f : files) {
	  System.out.println(f.getAbsolutePath());
	}
  }
}
