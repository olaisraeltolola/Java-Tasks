import java.util.Scanner;
	public class MorningCake{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		boolean repeat = true;

	while (repeat){
	System.out.print("Enter a number: ");
		int number = input.nextInt();
	
	int favouriteNumber = 17;

if (number > favouriteNumber )
	System.out.println("Above");
if (number < favouriteNumber )
	System.out.println("Below");

if (number == favouriteNumber ){
	System.out.println("Correct");
	repeat = false;
}
}
	}
}
