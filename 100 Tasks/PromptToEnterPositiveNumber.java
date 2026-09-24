import java.util.Scanner;
public class PromptToEnterPositiveNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

int positiveNumber = 0;

do{
System.out.print("Enter a positive number:");
positiveNumber = input.nextInt();

	if (positiveNumber > 0)
	System.out.println(positiveNumber);	

} while (positiveNumber <= 0);

}
}
	
	
