import java.util.Scanner;
public class LargerNumberInAPair{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter a number");
int number = input.nextInt();
int largest = 0;
int overallLargest = 0;
int pairWithLargestNumber = 0;
int counter = 0;


for  (int index = 1; index <= number; index++){
	System.out.println("Pair " + index);
	System.out.println("Enter the first number");
	int firstNumber = input.nextInt();

	System.out.println("Enter the second number");
	int secondNumber = input.nextInt();
	System.out.println();


if (firstNumber > secondNumber)
largest = firstNumber;

else
largest = secondNumber;

	System.out.println("The larger number = " + largest);
	counter++;

if (largest > overallLargest){
overallLargest = largest;
pairWithLargestNumber = counter;
}
}

System.out.println("The pair which had the overall largest number = Pair " + pairWithLargestNumber);

}
}
