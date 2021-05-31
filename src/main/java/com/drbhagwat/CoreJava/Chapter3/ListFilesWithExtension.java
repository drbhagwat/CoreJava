package com.drbhagwat.CoreJava.Chapter3;

import java.io.File;

/* 
 * Using the listFiles(FileFilter) and isDirectory method of the java.io.File class, 
 * write a method that returns all files of a given directory with a given extension. Use a lambda 
 * expression, not a FilenameFilter. Which variable from the enclosing scope does it capture?
 */
public class ListFilesWithExtension {

  public static void main(String[] args) {

	if (args.length != 2) {
	  System.out.println("Usage ListSubDir <directory> <extension>");
	}

	File dir = new File(args[0]);

	File[] newFiles = dir.listFiles((d, f) -> {
		return f.toLowerCase().endsWith(args[1]);
	  });

	for (File f : newFiles) {
	  System.out.println(f.getAbsolutePath());
	}
  }
}
