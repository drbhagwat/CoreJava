package com.drbhagwat.chapters.two;

import java.time.DayOfWeek;
import java.time.LocalDate;

import static java.time.LocalDate.*;
import static java.lang.System.*;

import java.time.Month;

/* 
 * Write a calendar printing program to print the calendar of the current month, 
 * so it starts the week on a Sunday. Use static imports for the System and LocalDate
 * classes.
 */
class Cal {
  public static void main(String args[]) {
	LocalDate localDate = now();
	Month month = localDate.getMonth();
	int year = localDate.getYear();
	localDate = of(year, month, 1);
	
	int day = localDate.getDayOfMonth();
	DayOfWeek dayOfWeek = localDate.getDayOfWeek();
	Integer intDay = dayOfWeek.getValue();

	out.println(month.toString() + " " + year);
	out.println();
	out.println("Sun Mon Tue Wed Thu Fri Sat");
	out.println();

	int numberOfSpaces = 4 * intDay.intValue();

	for (int i = 0; i < numberOfSpaces; i++) {
	  out.print(" ");
	}

	out.printf("%-4d", day);

	while ((localDate = localDate.plusDays(1)).getMonth() == month) {
	  day++;
	  out.printf("%-4d", day);

	  if (localDate.getDayOfWeek() == DayOfWeek.SATURDAY) {
		out.printf("\n");
	  }
	}
	out.printf("\n");
  }
}
