import java.util.Scanner;
public class SalarySlip{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

double tax = 0;

for (int index = 1; index <= 5; index++){
	System.out.println("Enter your salary:");
	double salary = input.nextDouble();

if (salary <= 50000){
tax = 0;
	System.out.println("Tax = " + tax);
	System.out.println("Gross salary = " + salary);
	System.out.println("Net pay = " + salary);
	System.out.println();

} else if (salary > 50000 && salary <= 150000){
tax = 0.1 * salary;
	System.out.println("Tax = " + tax);
	System.out.println("Gross salary = " + salary);
	System.out.println("Net pay = " + (salary - tax));
	System.out.println();

} else {
tax = 0.2 * salary;
	System.out.println("Tax = " + tax);
	System.out.println("Gross salary = " + salary);
	System.out.println("Net pay = " + (salary - tax));
	System.out.println();

}

}
	}
}