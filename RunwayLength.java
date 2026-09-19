import java.util.Scanner;
	public class RunwayLength{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter the speed in meters/second");
double speed = input.nextDouble();

System.out.println("Enter the acceleration in meters/second squared");
double acceleration = input.nextDouble();

double runwayLength = (speed*speed)/(2*acceleration);
System.out.println("The minimum runway length = " + runwayLength);
}
}

