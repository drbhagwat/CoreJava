package Chapter1;

import java.util.Scanner;

/* 
 * Using only the conditional operator, write a program that reads 
 * three integers and prints the largest. Repeat with Math.max.
 */
public class Exercise3 {

  public static void main(String[] args) {
	System.out.print("Please input 3 integers ");

	Scanner scanner = new Scanner(System.in);
	int number1 = scanner.nextInt();
	int number2 = scanner.nextInt();
	int number3 = scanner.nextInt();
	scanner.close();

	System.out.println("number1, number2 and number3 are " + number1 + " " + number2 + " " + number3);

	int larger = Math.max(number1, number2);
	int largest = Math.max(number3, larger);
	
	int greater = (number1 >= number2) ? number1 : number2;
	int greatest = (greater >= number3) ? greater: number3;
	System.out.println("The largest is " + greatest);

	System.out.println("The largest is " + largest);
  }
}
