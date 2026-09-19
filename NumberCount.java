import java.util.Scanner;
	public class NumberCount{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number one");
		int numberOne = input.nextInt();
		
		System.out.println("Enter number two");
		int numberTwo = input.nextInt();

		System.out.println("Enter number three");
		int numberThree = input.nextInt();

		System.out.println("Enter number four");
		int numberFour = inputNumber.nextInt();

		System.out.println("Enter number five");
		int numberFive = inputNumber.nextInt();
		
	int negativeNumber = 0;
	int positiveNumber = 0;
	int zeros = 0;

if(numberOne > 0) {
positiveNumber = positiveNumber + 1;
} else if (numberOne < 0) {
negativeNumber = negativeNumber + 1;
} else {
zeros = zeros + 1;
}

if(numberTwo > 0) {
positiveNumber = positiveNumber + 1;
} else if (numberTwo < 0) {
negativeNumber = negativeNumber + 1;
} else {
zeros = zeros + 1;
}

if(numberThree > 0) {
positiveNumber = positiveNumber + 1;
} else if (numberThree < 0) {
negativeNumber = negativeNumber + 1;
} else {
zeros = zeros + 1;
}

if(numberFour > 0) {
positiveNumber = positiveNumber + 1;
} else if (numberFour < 0) {
negativeNumber = negativeNumber + 1;
} else {
zeros = zeros + 1;
}

if(numberFive > 0) {
positiveNumber = positiveNumber + 1;
} else if (numberFive < 0) {
negativeNumber = negativeNumber + 1;
} else {
zeros = zeros + 1;
}

	System.out.println("Number of negative nummbers = " + negativeNumber);
	System.out.println("Number of positive nummbers = " + positiveNumber);
	System.out.println("Number of zeros = " + zeros);
}
}