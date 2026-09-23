import java.util.Scanner;
	public class TaxCalculation{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter the price:");
double price = input.nextDouble();

double tax = 0;
double total = 0;

tax = price * 0.075;
total = price + tax;

System.out.println("Total = " + total);
}
}