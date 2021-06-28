package com.drbhagwat.chapter.one;

import java.util.logging.Logger;

/**
 * Section 1.5.3, "String comparison" (Page 25) has an example of two strings s
 * and t so that s.equals(t) but s != t. Come up with a different example that
 * does not use substring.
 *
 * @author : Dinesh Bhagwat
 * @version : 1.0
 * @since : 2021-June-28
 */
public class ExerciseNine {
  /**
   * Section 1.5.3, "String comparison" (Page 25) has an example of two strings s
   * and t so that s.equals(t) but s != t. This method comes up with a different example that
   * does not use substring.
   *
   * @param args - command-line arguments (none).
   */
  public static void main(String[] args) {
    // get the name of the class in a generic way from the current thread instead of hardcoding
    var logger = Logger.getLogger(Thread.currentThread().getClass().getName());

    var string1 = "dinesh";

    /*
     * If you concatenate two or even more string literals and if the resulting content is the same as the earlier
     * defined string literal, Java is smart enough to make the reference of the new string literal point to the
     * earlier defined string literal - as seen by the following example.
     */
    var string2 = "d" + "i" + "n" + "e" + "s" + "h";
    var message = "Are the contents of string1, string2 the same? " + string1.equals(string2);
    logger.info(message);

    message = "Does string1 refer to the same memory location as string2? " + (string1 == string2);
    logger.info(message);
    /*
     * Note that for string3, the memory is allocated on heap. Even though the content is the same as earlier, the
     * reference (memory location where it is stored) is different.
     */
    var string3 = new String("dinesh");

    message = "Does string1 refer to the same address (memory location) as string3? " + (string1 == string3);
    logger.info(message);

    /*
     * Once you internalize string3, the new string would again point to the same earlier defined string reference.
     */
    var string4 = string3.intern();

    message = "Does string4 refer to the same address as string1 after internalizing string3? " + (string1 == string4);
    logger.info(message);

    message = "Does string4 refer to the same address as string2 after internalizing string3? " + (string2 == string4);
    logger.info(message);
  }
}
