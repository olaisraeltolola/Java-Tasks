import java.util.Scanner;
	public class DigitSum{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number (1-999)");
		int number = input.nextInt();

	if(number > 999 | number < 1){
		System.out.println("This number cannot be inputted");
	}
	
		int numOne = (number % 10);
		int numTwo = (number / 10) %10;
		int numThree = (number / 100) %10;

	if (number <= 9 && number > 0){
		int sumOne = numOne;
		System.out.print("The sum of digits = " + sumOne);

	}else if (number <= 99 && number >= 10){
	int sumTwo = numOne + numTwo;
	System.out.print("The sum of digits = " + sumTwo);

}	else if (number >= 100 && number < 1000){
	int sumThree = numOne + numTwo + numThree;
	System.out.print("The sum of digits = " + sumThree);
}
}
}
