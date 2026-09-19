import java.util.Scanner;
	
public class LCMOfTwoNumbers{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

System.out.println("Enter the first number");
int numberOne = input.nextInt();

System.out.println("Enter the second number");
int numberTwo = input.nextInt();

int smallest = numberOne;

if (numberOne > numberTwo)
smallest = numberTwo;

int lcm = smallest;
while (lcm >= smallest){
if (lcm % numberOne == 0 && lcm % numberTwo == 0)
break;
else
lcm++;
}
System.out.print(lcm);		
}
}