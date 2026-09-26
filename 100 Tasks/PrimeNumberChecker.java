import java.util.Scanner;
public class PrimeNumberChecker{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

int number = 1;

while (number != 0){
int counter = 0;
System.out.println("Enter a number: ");
number = input.nextInt();

for (int index = 2; index < number; index ++){
if (number % index == 0)
counter++;
}

if (counter == 0 && counter > 1)
System.out.println("Prime");

else
System.out.println("Not Prime");

}
}
}