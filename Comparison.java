import java.util.Scanner;
public class Comparison{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the number1: ");
		int numberOne = input.nextInt();

		System.out.print("Enter the number2: ");
		int numberTwo = input.nextInt();

		System.out.print("Enter the number3: ");
		int numberThree = input.nextInt();

		System.out.print("Enter the number4: ");
		int numberFour = input.nextInt();

		System.out.print("Enter the number5: ");
		int numberFive = input.nextInt();

			int largest = numberOne;
			int smallest = numberOne;

		if(numberTwo > largest)
		largest = numberTwo;

		if(numberThree > largest)
		largest = numberThree;

		if(numberFour > largest)
		largest = numberFour;

		if(numberFive > largest)
		largest = numberFive;
			
		if(numberTwo < smallest)
		smallest = numberTwo;

		if(numberThree < smallest)
		smallest = numberThree;

		if(numberFour < smallest)
		smallest = numberFour;

		if(numberFive < smallest)
		smallest = numberFive;
			System.out.println("The smallest number is " + smallest);
			System.out.println("The largest number is " + largest);



	}
}