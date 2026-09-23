import java.util.Scanner;
	public class AgeCategorization{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

while(true){
System.out.println("Enter your age:");
int age = input.nextInt();

if (age >= 0 && age <= 13){
	System.out.println("Child");
	break;

} else if (age > 13 && age <= 17){
	System.out.println("Teenager");
	break;

} else if (age > 17 && age <= 64){
	System.out.println("Adult");
	break;

} else if (age > 64 ){
	System.out.println("Senior");
	break;

} else
	System.out.println("Invalid age");
}
}
}