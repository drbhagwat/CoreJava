package com.drbhagwat.CoreJava.Chapter2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

/* 
 * Write a calendar printing program to print the calendar of the current month, 
 * so it starts the week on a Sunday.
 */
class Exercise1 {
  public static void main(String args[]) {
	LocalDate localDate = LocalDate.now();
	Month month = localDate.getMonth();
	int year = localDate.getYear();
	localDate = LocalDate.of(year, month, 1);
	
	int day = localDate.getDayOfMonth();
	DayOfWeek dayOfWeek = localDate.getDayOfWeek();
	Integer intDay = dayOfWeek.getValue();

	System.out.println(month.toString() + " " + year);
	System.out.println();
	System.out.println("Sun Mon Tue Wed Thu Fri Sat");
	System.out.println();

	int numberOfSpaces = 4 * intDay.intValue();

	for (int i = 0; i < numberOfSpaces; i++) {
	  System.out.print(" ");
	}

	System.out.printf("%-4d", day);

	while ((localDate = localDate.plusDays(1)).getMonth() == month) {
	  day++;
	  System.out.printf("%-4d", day);

	  if (localDate.getDayOfWeek() == DayOfWeek.SATURDAY) {
		System.out.printf("\n");
	  }
	}
	System.out.printf("\n");
  }
}
