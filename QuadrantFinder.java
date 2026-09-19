import java.util.Scanner;
	public class QuadrantFinder {
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

	System.out.println("Enter the first number");
	int numberOne = input.nextInt();

	System.out.println("Enter the second number");
	int numberTwo = input.nextInt();

if (numberOne > 0 && numberTwo > 0){
	System.out.println("Q1");
} else if (numberOne < 0 && numberTwo > 0){
	System.out.println("Q2");
} else if (numberOne < 0 && numberTwo < 0){
	System.out.println("Q3");
} else if (numberOne > 0 && numberTwo < 0){
	System.out.println("Q4");
} else if (numberOne == 0 && numberTwo == 0){
	System.out.println("Origin");
} else if (numberOne != 0 && numberTwo == 0){
	System.out.println("X-axis");
} else {
	System.out.println("Y-axis");
}
}
}


