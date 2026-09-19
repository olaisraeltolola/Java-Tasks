import java.util.Scanner;
	public class Circle{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the radius");
		int radius = input.nextInt();
		double pi = Math.PI;
		int diameter = 2*radius;
		double circumference = 2*pi*radius;
		double area = pi*radius*radius;
			System.out.println("The diameter is " + diameter);
			System.out.println("The circumference is " + circumference);
			System.out.println("The area is " + area);
	}
}