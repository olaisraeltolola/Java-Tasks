import java.util.Scanner;
	public class NumberInputSwap{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter the first number");
int numberOne = input.nextInt();10

System.out.println("Enter the second number");
int numberTwo = input.nextInt();20

System.out.println("Before value: Number one = " + numberOne);
System.out.println("Before value: Number two = " + numberTwo);

numberOne = numberOne * numberTwo;
numberTwo = numberOne / numberTwo;
numberOne = numberOne / numberTwo; 

System.out.println("After value: Number one = " + numberOne);
System.out.println("After value: Number two = " + numberTwo);

}
}

