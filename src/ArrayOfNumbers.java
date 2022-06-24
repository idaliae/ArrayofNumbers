import java.util.*;

public class ArrayOfNumbers {
	public static void main(String [] args) {
		
		System.out.println("Hello there");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first number:");
		Integer firstNumber = input.nextInt();
		System.out.printf("You chose %s.\n", firstNumber);
		
		System.out.println("Enter your second number:");
		Integer secondNumber = input.nextInt();
		System.out.printf("You chose %s and %s.\n", firstNumber, secondNumber);
		
		System.out.println("Enter your third number:");
		Integer thirdNumber = input.nextInt();
		System.out.printf("You chose %s, %s and %s.\n", firstNumber, secondNumber, thirdNumber);
		
		System.out.println("Enter your fourth number:");
		Integer fourthNumber = input.nextInt();
		System.out.printf("You chose %s, %s, %s and %s.\n", firstNumber, secondNumber, thirdNumber, fourthNumber);
		
		System.out.println("Enter your fifth number:");
		Integer fifthNumber = input.nextInt();
		System.out.printf("You chose %s, %s, %s, %s and %s.\n", firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber);
		
		ArrayList<Integer> numberList = new ArrayList<Integer>(
				Arrays.asList(firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber));
		
		System.out.println(numberList);
		
		Integer sum = 0;
		Integer product = 1;
		Integer largestNumber = numberList.get(0);
		Integer smallestNumber = numberList.get(0);
		
		for (Integer number : numberList) {
			System.out.println(number);
			sum = sum + number;
			product = product * number;
			
			if (number > largestNumber) {
				largestNumber = number;
			}
			
			if (number < smallestNumber) {
				smallestNumber = number;
			}
		}
		
		System.out.printf("The sum of your numbers is : %d.\n", sum);
		System.out.printf("The product is: %d.\n", product);
		System.out.printf("The largest number is: %d.\n", largestNumber);
		System.out.printf("The smallest number is: %d.\n", smallestNumber);
		
		
		
		
//Write a program that does the following:
//Asks the user for 5 numbers
//Stores them in an array list
//Finds the sum, product, largest, and smallest of those numbers

	}
}
