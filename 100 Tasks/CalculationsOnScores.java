import java.util.Scanner;
public class CalculationsOnScores{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

double score = 0;
int count = 0;
double sum = 0;
double highestScore = 0;
double lowestScore = 0;
double average = 0;

System.out.println("Please press '-1' to stop inputting scores");

while (score != -1){
System.out.println("Enter your score:");
score = input.nextDouble();
count++;

if (score != -1)
lowestScore = score;

sum += score;

if (score > highestScore)
highestScore = score;

if (lowestScore > score && score != -1)
lowestScore = score;

}
average = (sum + 1)/count;
System.out.println("The number of scores inputted = " + (count - 1));
System.out.println("Sum of scores = " + (sum + 1));
System.out.println("Average of scores = " + average);
System.out.println("The highest score = " + highestScore);
System.out.println("The lowest score = " + lowestScore);

}
}

