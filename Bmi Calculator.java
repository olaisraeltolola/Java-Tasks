import java.util.Scanner;
public class Bmi Calculator{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);

		System.out.println("Enter the weight(Pounds): ");
		int weight = input.nextInt();
		System.out.println("Enter the height(Inches): ");
		int height = input.nextInt();

		double bmi = ((weight*703) + (height*height));
		System.out.println("BMI = " + bmi);
}
}