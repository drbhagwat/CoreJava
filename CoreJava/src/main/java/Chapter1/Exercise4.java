package Chapter1;


/* 
 * Write a program that prints the smallest and largest positive double  
 * values: Hint: Lookup Math.nextUp in the Java API.
 */
public class Exercise4 {

  public static void main(String[] args) {
	System.out.println("The smallest double value is " + Math.nextUp(0.0));
	System.out.println("The smallest double value is " + Double.MIN_VALUE);
	
	System.out.println("The largest double value is " + Double.MAX_VALUE);
	System.out.println("The largest double value is " + Double.POSITIVE_INFINITY);

  }
}
