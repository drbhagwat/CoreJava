package com.drbhagwat.CoreJava.Chapter2;

import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import com.opencsv.CSVReaderHeaderAware;

public class OpenCSV {
  public static void main(String[] args) throws Exception {
	try {
	  Map<String, String> values = new CSVReaderHeaderAware(new FileReader("yourfile.csv")).readMap();

	  for (String element : values.keySet()) {
		String key = element.toString();
		String value = values.get(key);
		System.out.println(key + " " + value);
	  }
	} catch (IOException e) {
	  e.printStackTrace();
	}
  }
}
