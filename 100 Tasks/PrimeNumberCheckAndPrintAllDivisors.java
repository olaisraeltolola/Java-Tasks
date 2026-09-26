import java.util.Scanner;
public class PrimeNumberCheckAndPrintAllDivisors{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter a number:");
int number = input.nextInt();

int counter = 0;

for (int index = 1; index <= number; index++){
if (number % index == 0){
counter++;
System.out.println("A divisor of " + number + " is " + index);
}
}

if (counter == 2 && number > 1)
System.out.println("This number is prime");

else 
System.out.println("This number is not prime");

}
}



