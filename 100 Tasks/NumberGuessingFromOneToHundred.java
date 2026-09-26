import java.util.Scanner;
public class NumberGuessingFromOneToHundred{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

int number = 0;
int wrongGuess = 0;

for(int guesses = 1; guesses <= 10; guesses++){

	System.out.println("Enter a number between 1 and 100");
	number = input.nextInt();

		if (number < 9){
		System.out.println("Too low, try again");
		wrongGuess++;

		} else if (number > 9){
		System.out.println("Too high, try again");
		wrongGuess++;

		} else {
		System.out.println("Correct number");
		break;
}
}
if (wrongGuess == 0)
	System.out.println("You scored 10 points");

else
	System.out.println("You have " + (10 - wrongGuess) + " points");
}
}
