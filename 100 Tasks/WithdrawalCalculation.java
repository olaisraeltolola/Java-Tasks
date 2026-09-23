public class WithdrawalCalculation{
	public static void main(String[] args){

double balance = 5000.00;

double finalBalance = 0;
double interest = 0;

finalBalance = balance + 1200.50;
finalBalance = finalBalance - 750.25;
interest = 0.015 * balance;

finalBalance += interest;

System.out.printf("The final balance = %.2f", finalBalance);

}
}
