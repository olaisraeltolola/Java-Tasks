import java.util.Scanner;
public class Multiples{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.println("Enter the number1");
	int numberOne= input.nextInt();
	int tripled = numberOne*3;

	System.out.println("Enter the number2");
	int numberTwo= input.nextInt();
	int doubled = numberTwo*2;

	if (tripled %doubled == 0){
		System.out.println("The First number is a multiple of the second number");
} if (tripled %doubled != 0){
	System.out.println("The first number is not a multiple of the second number");
}
}
}