import java.util.Scanner;
public class GradingSystem{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

for (int index = 1; index <= 5; index++){
System.out.println("Enter your mark");
double mark = input.nextDouble();

if (mark >= 90)
System.out.println("Grade = A");

else if (mark < 90 && mark >= 80)
System.out.println("Grade = B");

else if (mark < 80 && mark >= 70)
System.out.println("Grade = C");

else if (mark < 70 && mark >= 60)
System.out.println("Grade = D");

else 
System.out.println("Grade = F");

}
}
}