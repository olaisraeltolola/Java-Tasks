import java.util.Scanner;
	public class LargestOfThreeNumbers{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter the first number");
int numberOne = input.nextInt();

System.out.println("Enter the second number");
int numberTwo = input.nextInt();

System.out.println("Enter the third number");
int numberThree = input.nextInt();

int largest = 0;

largest = numberOne;

if (numberTwo > numberOne)
	largest = numberTwo;
if (numberThree > numberOne)
	largest = numberThree;

System.out.println("The largest number = " + largest);
}
}