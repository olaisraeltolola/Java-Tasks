import java.util.Scanner;
	public class Conversion{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number(metres)");
		double number = input.nextDouble();

		double conversion = number*3.2786;

		System.out.print("the number in feet is " + conversion);
}
}