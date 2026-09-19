import java.util.Scanner;
	public class AreaAndVolumeOfTriangle{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the equilateral side");
		double sideOne = input.nextDouble();

	double area = ((Math.sqrt(3)/4)*(sideOne*sideOne));
	double volume = area*sideOne;

	System.out.println("The area is " + area);
	System.out.println("The volume is " + volume);
}
}