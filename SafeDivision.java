import java.util.Scanner;
	public class SafeDivision{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

	System.out.println("Enter the first number");
	int numberOne = input.nextInt();

	System.out.println("Enter the second number");
	int numberTwo = input.nextInt();

if (numberTwo != 0){
	System.out.println("The division is " + (numberOne/numberTwo));
	} else {
		System.out.println("Cannot divide by zero");
}

}
}