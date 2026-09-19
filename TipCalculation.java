import java.util.Scanner;
	public class TipCalculation{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the subtotal");
		double subtotal = input.nextDouble();

		System.out.println("Enter the gratuity rate (in percentage)");
		double gratuityRate = input.nextDouble();

		double gratuity = gratuityRate*subtotal;
		double total = gratuity + subtotal;
	
		System.out.println("The gratuity is " + gratuity);
		System.out.println("The total is " + total);
}
}

