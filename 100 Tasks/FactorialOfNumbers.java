import java.util.Scanner;
public class FactorialOfNumbers{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter a number:");
int number = input.nextInt();

long factorial = 1;

for (int countDown = number; countDown >= 1; countDown--){
factorial *= countDown;
}

System.out.println("The factorial = " + factorial);

}
}