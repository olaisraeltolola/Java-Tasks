import java.util.Scanner;
public class PassOrFailExamScores{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

int pass = 0;
int fail = 0;

for (int index = 1; index <= 10; index++){

System.out.println("Enter a score: ");
double score = input.nextDouble();

if (score >= 50){
System.out.println("Pass");
pass++;

} else {
System.out.println("Fail");
fail++;
}

}
System.out.println("Total number of passes = " + pass);
System.out.println("Total number of fails = " + fail);

}
}
