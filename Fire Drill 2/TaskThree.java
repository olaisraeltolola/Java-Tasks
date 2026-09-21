import java.util.Scanner;
	public class TaskThree{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

double sum = 0;
double average = 0;
for (int counter = 1; counter <= 10; counter++){
System.out.println("Enter a score");
double score = input.nextDouble();

sum += score;
}
average = sum/10.0;

System.out.println();
System.out.println("Sum = " + sum);
System.out.println("Average = " + average);
	}
}