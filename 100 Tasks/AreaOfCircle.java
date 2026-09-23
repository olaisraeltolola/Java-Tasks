import java.util.Scanner;
	public class AreaOfCircle{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter the radius:");
double radius = input.nextDouble();

double area = 0;

final double PI = 22/7.0;

area = PI * radius * radius;

System.out.printf("The area = %.2f",area);


}
}