package com.drbhagwat.CoreJava.Chapter1;

/* 
 * Section 1.5.3, "String comparison" (Page 25) has an example of two strings 
 * s and t so that s.equals(t) but s != t. Come up with a different example that
 * does not use substring.
 */
public class Exercise9 {
  public static void main(String[] args) {
	String string1 = "dinesh";
	
	/*
	 * If you concatenate two or more string literals and if the result is exactly the same as 
	 * an already defined string literal, Java is smart enough to point the reference of the resul to 
	 * the earlier defined string literal as seen by the following example.
	 */
	
	String string2 = "d" + "i" + "n" + "e" + "s" + "h";
	
	/*
	 * Here, for string3, the memory is allocated on heap and hence though the content is the same as earlir, 
	 * the reference is different.
	*/
	
	String string3 = new String("dinesh");

	/*
	 * Once you internalize string3, the new string would again point to the same earlier defined 
	 * string reference.
	 */

	String string4 = string3.intern();

	System.out.println("Is string1 == string2? " + string1.equals(string2));
	System.out.println("Is string1 refers to the same address as string2? " + (string1 == string2));
	System.out.println("Is string1 refers to the same address as string3? " + (string1 == string3));
	System.out.println("Is string1 refers to the same address as string3? " + (string1 == string4));
  }
}
