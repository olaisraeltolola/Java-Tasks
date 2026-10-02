import java.util.Scanner;
	public class NumberInputSwap{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter the first number");
int numberOne = input.nextInt();

System.out.println("Enter the second number");
int numberTwo = input.nextInt();

System.out.println("Before value: First number = " + numberOne);
System.out.println("Before value: Second number = " + numberTwo);

numberOne = numberOne * numberTwo;
numberTwo = numberOne / numberTwo;
numberOne = numberOne / numberTwo; 

System.out.println("After value: First number = " + numberOne);
System.out.println("After value: Second number = " + numberTwo);

}
}

