import java.util.Scanner;
	public class IncomeAndTax{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter your income");
double income = input.nextDouble();

double tax = 0;

if (income >= 0 && income <= 300000)
	System.out.println("Total tax owed = N0");

if (income <= 600000 && income > 300000)
	System.out.println("Total tax owed = N" + (0.07 * income));

if (income > 600000)
	System.out.println("Total tax owed = N" + (0.15 * income));

}
}
