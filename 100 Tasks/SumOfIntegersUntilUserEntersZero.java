import java.util.Scanner;
public class SumOfIntegersUntilUserEntersZero{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

int number = 0;
int sum = 0;

do {
	System.out.println("Enter a number:");
	number = input.nextInt();
	sum += number;

} while(number != 0);

System.out.println("The Sum = " + sum);
}
}