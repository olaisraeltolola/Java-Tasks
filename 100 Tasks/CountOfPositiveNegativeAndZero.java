import java.util.Scanner;
public class CountOfPositiveNegativeAndZero{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

int positiveNumbers = 0;
int negativeNumbers = 0;
int zeros = 0;

for (int counter = 1; counter <= 10; counter++){
System.out.println("Enter a number");
int number = input.nextInt();

if (number > 0)
positiveNumbers++;

else if (number == 0)
zeros++;

else
negativeNumbers++;

}
System.out.println("Positive numbers = " + positiveNumbers);
System.out.println("Negative numbers = " + negativeNumbers);
System.out.println("Number of zeros = " + zeros);

}
}
