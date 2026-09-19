import java.util.Scanner;
	public class Ex{
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

	if(numberOne >= 30 || numberOne <= 30){
	for (int num = 1; num <= numberOne; num++){
	System.out.print("*");
	}

	System.out.println();
	}

	if(numberTwo >= 30 || numberTwo <= 30){
	for (int num = 1; num <= numberTwo; num++){
	System.out.print("*");
	}

	System.out.println();
	}

	if(numberThree >= 30 || numberThree <= 30){
	for (int num = 1; num <= numberThree; num++){
	System.out.print("*");
	}

	System.out.println();
	}

	if(numberFour >= 30 || numberFour <= 30){
	for (int num = 1; num <= numberFour; num++){
	System.out.print("*");
	}

	System.out.println();
	}

	if(numberFive >= 30 || numberFive <= 30){
	for (int num = 1; num <= numberFive; num++){
	System.out.print("*");
	}

	System.out.println();
	      }

	}
}

