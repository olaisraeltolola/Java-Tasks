import java.util.Scanner;
	public class TaskEight{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		boolean repeat = true;
int index = 0;
double sum = 0;
while (repeat){
System.out.println("Enter a score");
double score = input.nextDouble();

if (score < 0 || score > 100){
	System.out.println("Invalid score");
	
} else {
sum += score;
index++;
}

if (index == 10)
repeat = false; 
}
System.out.println();
System.out.println("Sum = " + sum);
	}
}