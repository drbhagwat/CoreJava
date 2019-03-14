package Chapter1;

/* 
 * Section 1.5.3, "String comparison" (Page 25) has an example of two strings 
 * s and t so that s.equals(t) but s != t. Come up with a different example that
 * does not use substring.
 */
public class Exercise9 {
  public static void main(String[] args) {
	String string1 = "dinesh";
	
	// if you just concatenate two strings and the result happens to be an already defined string
	// Java is smart enough to refer to the already defined string
	String string2 = "din" + "esh";
	
	// here the memory is allocated on heap.
	String string3 = new String("dinesh");

	System.out.println("Is string1 == string2? " + string1.equals(string2));
	System.out.println("Is string1 refers to the same address as string2? " + (string1 == string2));
	System.out.println("Is string1 refers to the same address as string3? " + (string1 == string3));
  }
}
