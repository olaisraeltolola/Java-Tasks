import java.util.Scanner;
	public class LargestOfThree {
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

	System.out.println("Enter the first number");
	int numberOne = input.nextInt();

	System.out.println("Enter the second number");
	int numberTwo = input.nextInt();

	System.out.println("Enter the third number");
	int numberThree = input.nextInt();

	int largest = numberOne;
	
if (numberTwo > largest)
	largest = numberTwo;
if (numberThree > largest)
	largest = numberThree;
	
System.out.println("The largest number is " + largest);

}
}