import java.util.Scanner;
	public class TaskOne{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

double sum = 0;
for (int counter = 1; counter <= 10; counter++){
System.out.println("Enter a score");
double score = input.nextDouble();

sum += score;
}
System.out.println();
System.out.println(sum);
	}
}