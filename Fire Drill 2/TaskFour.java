import java.util.Scanner;
	public class TaskFour{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

double sum = 0;
for (int counter = 1; counter <= 10; counter++){
System.out.println("Enter a score");
double score = input.nextDouble();

if (counter % 2 == 0)
sum += score;

}
System.out.println();
System.out.println("Sum = " + sum);
	}
}