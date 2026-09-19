import java.util.Scanner;
	public class HCFOfTwoNumbers{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter the first number");
int numberOne = input.nextInt();

System.out.println("Enter the second number");
int numberTwo = input.nextInt();

int smallest = numberOne;

if (numberOne > numberTwo)
smallest = numberTwo;

int hcf = smallest;
while(hcf >= 2){
if (numberOne % hcf == 0 && numberTwo % hcf == 0){
break;
}
else
hcf--;
}
System.out.println(hcf);
}
}
