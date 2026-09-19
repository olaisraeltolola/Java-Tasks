import java.util.Scanner;
	public class SquareMetreToPing{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number (square metres)");
		double number = input.nextDouble();

		double conversion = number*0.3025;

		System.out.print("the number in ping is " + conversion);
}
}