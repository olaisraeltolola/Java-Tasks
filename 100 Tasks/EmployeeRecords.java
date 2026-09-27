import java.util.Scanner;
public class EmployeeRecords{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

String payrollReport = "";
String classification = "";
double weeklyPay = 0;
for (int records = 1; records <= 5; records++){

System.out.println("Enter your name:");
String name = input.nextLine();

System.out.println("Enter your hourly wage:");
double wage = input.nextDouble();

System.out.println("Enter how many hours worked");
double hours = input.nextDouble();

String clear = input.nextLine();

if (hours < 40)
weeklyPay = (wage * 40) + ((hours - 40) * wage * 1.5);

else
weeklyPay = wage * hours;

if (weeklyPay < 50000)
classification = "Low";

else if (weeklyPay >= 50000 && weeklyPay <= 150000)
classification = "Mid";

else
classification = "High";

payrollReport += name + "	" + hours + "	" + wage + "	" + weeklyPay + "	" + classification + "\n";
}

System.out.println("Name	Hours Worked	Hourly Wage	Weekly Pay	Classification" );
System.out.println(payrollReport);

}
}

