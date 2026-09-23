import java.util.Scanner;
public class DivisibilityOfNumbers{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter a number");
int number = input.nextInt();

if (number % 3 == 0 && number % 5 == 0)
System.out.println("Divisible by 3 and 5");

else if (number % 3 == 0)
System.out.println("Divisible by 3 ");

else if (number % 5 == 0)
System.out.println("Divisible by 5");

else 
System.out.println("Divisible by neither");

}
}	

