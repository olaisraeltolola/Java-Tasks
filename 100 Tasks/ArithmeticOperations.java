import java.util.Scanner;
	public class ArithmeticOperations{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter the first number:");
double numberOne = input.nextDouble();

System.out.println("Enter the second number:");
double numberTwo = input.nextDouble();

double sum = 0;
double difference = 0;
double product = 0;
double quotient = 0;

sum = numberOne + numberTwo;
difference = numberOne - numberTwo;
product = numberOne * numberTwo;
quotient = numberOne/numberTwo;

System.out.println("The sum = " + sum);
System.out.println("The difference = " + difference);
System.out.println("The product = " + product);
System.out.println("The quotient = " + quotient);
}
}



