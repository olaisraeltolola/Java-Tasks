import java.util.Scanner;
	public class AgeCalculator{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter your first name:");
String name = input.next();

String clear = input.nextLine();

System.out.println("Enter your last name:");
String lastName = input.nextLine();

System.out.println("Enter your year of birth:");
int yearOfBirth = input.nextInt();

int age = 0;

age = 2025 - yearOfBirth;

System.out.println();
System.out.println("First Name: " + name);
System.out.println("Last Name: " + lastName);
System.out.println("Year of Birth: " + yearOfBirth);
System.out.println("Age: " + age);
}
}
