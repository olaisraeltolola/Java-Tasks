import java.util.Scanner;
	public class BarChart{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);	
		
System.out.println("Enter the number (1-30): ");
	int numberOne = input.nextInt();

System.out.println("Enter the number (1-30): ");
	int numberTwo = input.nextInt();

System.out.println("Enter the number (1-30): ");
	int numberThree = input.nextInt();

System.out.println("Enter the number (1-30): ");
	int numberFour = input.nextInt();

System.out.println("Enter the number (1-30): ");
	int numberFive = input.nextInt();

	for (int num = 1; num <= numberOne; num++){
	System.out.print("*");
	}
	System.out.println();

	for (int num = 1; num <= numberTwo; num++){
	System.out.print("*");
	}
	System.out.println();

	for (int num = 1; num <= numberThree; num++){
	System.out.print("*");
	}
	System.out.println();

	for (int num = 1; num <= numberFour; num++){
	System.out.print("*");
	}

	System.out.println();

	for (int num = 1; num <= numberFive; num++){
	System.out.print("*");
	}
	System.out.println();

	}
}

