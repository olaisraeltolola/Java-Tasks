import java.util.Scanner;
	public class LeapYearCheck{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter a year");
int currentYear = input.nextInt();

if (currentYear % 4 == 0 && currentYear % 400 == 0)
	System.out.println("Leap year");
else
	System.out.println("It is not a leap year");

}
}


