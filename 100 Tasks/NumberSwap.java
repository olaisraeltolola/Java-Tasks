import java.util.Scanner;
	public class NumberSwap{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter the first number:");
int firstNumber = input.nextInt();

System.out.println("Enter the second number:");
int secondNumber = input.nextInt();

System.out.println("Before values: First Number = " + firstNumber);
System.out.println("Before values: Second Number = " + secondNumber);

int thirdNumber = 0;

thirdNumber = firstNumber + secondNumber;

firstNumber = thirdNumber - firstNumber;
secondNumber = thirdNumber - secondNumber;

System.out.println("After values: First Number = " + firstNumber);
System.out.println("After values: Second Number = " + secondNumber);

}
}




