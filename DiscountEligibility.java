import java.util.Scanner;
	public class DiscountEligibility {
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

	System.out.println("Enter your total bill");
	double totalBill = input.nextDouble();

	System.out.println("Are you a member?");
	String membership = input.next();

if (totalBill >= 1000 && membership.equalsIgnoreCase("yes")){
	System.out.println("You have 10% off\nYour total bill is " + (totalBill - (totalBill*0.1)));

} else if (totalBill >= 1000 && membership.equalsIgnoreCase("no")){
	System.out.println("You have 5% off\nYour total bill is " + (totalBill - (totalBill*0.05)));

} else {
	System.out.println("You have no discount\nYour total bill is " + totalBill);
}
}
}