import java.util.Scanner;
public class AlmightyFormula{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.print("a = ");
double firstNumber = input.nextDouble();

System.out.print("b = ");
double secondNumber = input.nextDouble();

System.out.print("c = ");
double thirdNumber = input.nextDouble();

double resultOne = 0;
double resultTwo = 0;

resultOne = (-secondNumber + Math.sqrt((secondNumber * secondNumber) - (4 * firstNumber * thirdNumber)))/(2 * firstNumber);

resultTwo = (-secondNumber - Math.sqrt((secondNumber * secondNumber) - (4 * firstNumber * thirdNumber)))/(2 * firstNumber);

System.out.println("x = " + resultOne);
System.out.println("x = " + resultTwo);

}
}