import java.util.Scanner;
	public class CashierCalculation{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter the item price:");
double price = input.nextDouble();

System.out.println("Enter the quantity:");
int quantity = input.nextInt();

double subtotal = 0;
double vat = 0;
double grandTotal = 0;

subtotal = price * quantity;
vat = subtotal * 0.2;
grandTotal = subtotal + vat;

System.out.println("The grand total = " + grandTotal);



}
		

}