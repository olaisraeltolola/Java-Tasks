import java.util.Scanner;
	public class OperatorsOnDoubles{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter the first number");
double numberOne = input.nextInt();

System.out.println("Enter the second number");
double numberTwo = input.nextInt();

System.out.println("Enter an operator");
String operator = input.next();

switch(operator){
	case "+" -> {System.out.println(numberOne + " " + operator + " " + numberTwo + " = " + (numberOne + numberTwo)); } 

	case "-" -> {System.out.println(numberOne + " " + operator + " " + numberTwo + " = " + (numberOne - numberTwo)); } 

	case "*" -> {System.out.println(numberOne + " " + operator + " " + numberTwo + " = " + (numberOne * numberTwo)); }

	case "/" -> {
		if (numberTwo != 0)
			System.out.println(numberOne + " " + operator + " " + numberTwo + " = " + (numberOne / numberTwo)); 
		else 
			System.out.println("Cannot divide by zero");
	} 

	default -> System.out.println("Not among the operators");
}
}
}

