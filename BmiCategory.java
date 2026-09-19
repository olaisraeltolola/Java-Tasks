import java.util.Scanner;
	public class BmiCategory {
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

	System.out.println("Enter your weight (in kilograms)");
	double weightInKilograms = input.nextDouble();

	System.out.println("Enter your height (in meters)");
	double heightInMeters = input.nextDouble();

double bmi = (weightInKilograms / ((heightInMeters)*(heightInMeters)));

if (bmi < 18.5){
	System.out.println("Underweight");

} else if (bmi >= 18.5 && bmi <= 24.9){
	System.out.println("Normal");

} else if (bmi >= 25 && bmi <= 29.9){
	System.out.println("Overweight");

} else {
	System.out.println("Obese");
}
}
}
