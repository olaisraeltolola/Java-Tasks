import java.util.Scanner;
public class NumberGuessingGame{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
int number = 0;
int counter = 0;

do{
System.out.println("Guess a number between 1 and 10: ");
number = input.nextInt();

if (number != 5)
System.out.println("Aw mehn, guess again!");

counter++;

} while (number != 5);

System.out.println("You guessed my favourite number!");
System.out.println("Your number of guesses = " + counter);

}
}

