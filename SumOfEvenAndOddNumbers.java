import java.util.Scanner;
	public class SumOfEvenAndOddNumbers{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);
System.out.println("How many integers do you want to input?");
int integers = input.nextInt();

int sumOfEven = 0;
int sumOfOdd = 0;
for(int counter = 1; counter <= integers; counter ++){
System.out.println("Enter a number:");
int number = input.nextInt();

if (number % 2 == 0)
sumOfEven += number;

if (number % 2 != 0)
sumOfOdd += number;
}

System.out.println("The sum of even numbers is " + sumOfEven);
System.out.println("The sum of odd numbers is " + sumOfOdd);
}
}
