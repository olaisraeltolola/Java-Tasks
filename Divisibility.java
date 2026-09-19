import java.util.Scanner;
public class Divisibility{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.println("Enter the number");
		int number = input.nextInt();
	
	if (number %3 == 0){
	System.out.println("The number is divisible by 3");	
	} if(number %3 != 0) {
	System.out.println("The number is not divisible by 3"); 
}
	}
}
		