import java.util.Scanner;
public class Measurement{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);

		System.out.println("Enter the weightInPounds: ");
		int weightInPounds = input.nextInt();
		System.out.println("Enter the heightInInches: ");
		int heightInInches = input.nextInt();

		double bmi = ((weightInPounds*703) + (heightInInches*heightInInches));
		System.out.println("BMI = " + bmi);
}
}