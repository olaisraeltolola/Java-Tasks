import java.util.Scanner;
	public class LetterGradingSystem{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

while(true){
System.out.println("Enter a score:");
double score = input.nextDouble();

if (score >=90 && score <= 100){
	System.out.println("A");
	break;

} else if (score >=80 && score < 90){
	System.out.println("B");
	break;

} else if (score >=70 && score < 80){
	System.out.println("C");
	break;

} else if (score >=60 && score < 70){
	System.out.println("D");
	break;

} else if (score < 60 && score >= 0){
	System.out.println("F");
	break;

} else
	System.out.println("Invalid score");

}
}
}