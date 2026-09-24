import java.util.Scanner;
public class FactorsOfPositiveIntegers{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter a number ");
int number = input.nextInt();

int index = 1;

while(index <= number){
if (number % index == 0)
System.out.println("Factors of " + number + " = " + index);
index++;
}
}
}

