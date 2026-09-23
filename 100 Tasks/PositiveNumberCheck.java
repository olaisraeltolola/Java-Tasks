import java.util.Scanner;
	public class PositiveNumberCheck{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter a number:");
int number = input.nextInt();

if (number > 0)
System.out.println("Positive");
}
}
