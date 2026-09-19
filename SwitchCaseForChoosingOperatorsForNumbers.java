import java.util.Scanner;
	
public class SwitchCaseForChoosingOperatorsForNumbers{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

int numberOfCorrectAnswers = 0;
int numberOfWrongAnswers = 0;

for(int counter = 1;counter <= 5; counter ++){

System.out.println("Enter the first number");
int numberOne = input.nextInt();

System.out.println("Enter the second number");
int numberTwo = input.nextInt();

System.out.println("Enter the mathematical sign");
char operator = input.next().charAt(0);

System.out.printf("Question: %d %c %d%n",numberOne, operator, numberTwo);

double correctAnswer = 0;

switch(operator){

case'+': correctAnswer = numberOne + numberTwo;
	break;

case'-': correctAnswer = numberOne - numberTwo;
	break;

case'x': correctAnswer = numberOne * numberTwo;
	break;

case'/': correctAnswer = numberOne / numberTwo;
	
}

System.out.printf("Answer: ");
double answer = input.nextDouble();

if (correctAnswer == answer){
System.out.println("Your answer is correct");
numberOfCorrectAnswers ++; }

else {
System.out.println("Your answer is wrong");
numberOfWrongAnswers ++;  }

}

System.out.println("The number of correct answers = " + numberOfCorrectAnswers);
System.out.println("The number of wrong answers = " + numberOfWrongAnswers);

}
}




