import java.util.Scanner;
	public class ScoreScaling{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

while (true){
System.out.println("Enter a score (1-50):");
double score = input.nextDouble();

double scoreOverHundred = 0;

scoreOverHundred = score * 2;

if (score <= 50 && score >= 1){
	System.out.println("Original mark = " + score);
	System.out.println("Scaled mark = " + scoreOverHundred);
	break;

} else {
	System.out.println("Invalid score, please enter again");

}
		}
	}
}