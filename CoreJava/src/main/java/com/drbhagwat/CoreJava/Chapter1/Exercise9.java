package com.drbhagwat.CoreJava.Chapter1;

/*
 * Problem Statement:
 *
 * Section 1.5.3, "String comparison" (Page 25) has an example of two strings
 * s and t so that s.equals(t) but s != t. Come up with a different example
 * that does not use substring.
 */

/**
 * Section 1.5.3, "String comparison" (Page 25) has an example of two strings
 * s and t so that s.equals(t) but s != t. Come up with a different example
 * that does not use substring.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2020-04-14
 */
public class Exercise9 {
  public static void main(String[] args) {
    String string1 = "dinesh";

    /*
     * If you concatenate two string literals and if the resulting content is
     * the same as an already defined string literal, Java is smart enough to
     * make the reference of the new string literal point to the string
     * literal defined earlier - as seen by the following example.
     */

    String string2 = "d" + "i" + "n" + "e" + "s" + "h";

    System.out.println("Are the contents of string1,  string2 the same? " + string1.equals(string2));
    System.out.println("Does string1 refer to the same memory location " +
        "as string2? " + (string1 == string2));

    /*
     * Note that for string3, the memory is allocated on heap and hence though
     * the content is the same as earlier, but, the reference is different.
     */

    String string3 = new String("dinesh");

    System.out.println("Does string1 refer to the same address (memory " +
        "location) as string3? " + (string1 == string3));

    /*
     * Once you internalize string3, the new string would again point to the
     * same earlier defined string reference.
     */

    String string4 = string3.intern();

    System.out.println("Does string4 refer to the same address as string1 " +
        "after internalizing? "
        + (string1 == string4));
    System.out.println("Does string4 refer to the same address as string2 " +
        "after internalizing? "
        + (string2 == string4));
  }
}
