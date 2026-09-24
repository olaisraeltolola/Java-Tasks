import java.util.Scanner;
public class NumberOfDaysInAMonth{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		boolean repeat = true;

while(repeat){
System.out.println("Enter a number between 1 and 12:");
int number = input.nextInt();

switch(number){
	case 1 -> {System.out.print("January has 31 days"); repeat = false;}
	case 2 -> {
		System.out.println("Enter the year:");
		int year = input.nextInt();

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		System.out.println("February has 29 days");
	
		else
		System.out.print("February has 28 days"); repeat = false;}
	
	case 3 -> {System.out.print("March has 31 days"); repeat = false;}	
	case 4 -> {System.out.print("April has 30 days"); repeat = false; }	
	case 5 -> {System.out.print("May has 31 days"); repeat = false; }
	case 6 -> {System.out.print("June has 30 days"); repeat = false;}
	case 7 -> {System.out.print("July has 31 days"); repeat = false;}
	case 8 -> {System.out.print("August has 31 days"); repeat = false;}
	case 9 -> {System.out.print("September has 30 days"); repeat = false;}
	case 10 -> {System.out.print("October has 31 days"); repeat = false;}
	case 11 -> {System.out.print("November has 30 days"); repeat = false;}
	case 12 -> {System.out.print("December has 31 days"); repeat = false; }

	default -> {System.out.println("This number is not between 1 and 12");}

}
}
}
}