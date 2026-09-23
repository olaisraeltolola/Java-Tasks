import java.util.Scanner;
	public class MilesToKilometresConversion{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter the distance in miles:");
double distanceInMiles = input.nextDouble();

double distanceInKilometres = 0;
distanceInKilometres = distanceInMiles * 1.60934;

System.out.println("The distance in miles = " + distanceInMiles);
System.out.println("The distance in kilometres= " + distanceInKilometres);
}
}
