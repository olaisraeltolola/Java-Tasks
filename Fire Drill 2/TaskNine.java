import java.util.Scanner;
	public class TaskNine{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

double sum = 0;

for (int counter = 1; counter <= 10; counter++){
System.out.println("Enter a score");
double score = input.nextDouble();

if (score >= 0 && score <= 100){
sum += score;
}
}
System.out.println();
System.out.println("Sum = " + sum);
	}
}