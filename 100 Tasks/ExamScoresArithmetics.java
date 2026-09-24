import java.util.Scanner;
public class ExamScoresArithmetics{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
int score = 0;
double sum = 0;
double average = 0; 
int count = 0;
int highestScore = 0;
int lowestScore = 0;

System.out.println("Please enter '-1' to stop inputting scores");

while (score != -1){
System.out.println("Enter a score");
score = input.nextInt();
count++;

lowestScore = score;
sum += score;

if (score > highestScore)
highestScore = score;

if (score < lowestScore && score != -1)
lowestScore = score;

}
average = sum/count;

System.out.println("The average = " + average);
System.out.println("The highest score = " + highestScore);
System.out.println("The lowestScore = " + lowestScore);

}
}

