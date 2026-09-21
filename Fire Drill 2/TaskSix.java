import java.util.Scanner;
	public class TaskSix{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

int index = 0;
double sum = 0;
double average = 0;
for (int counter = 1; counter <= 10; counter++){
System.out.println("Enter a score");
double score = input.nextDouble();

if (score % 2 == 0){
sum += score;
index++;
}
}
average = sum/index;

System.out.println();
System.out.println("Average = " + average);

	}
}