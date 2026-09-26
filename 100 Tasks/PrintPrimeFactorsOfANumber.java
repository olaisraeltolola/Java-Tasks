import java.util.Scanner;
public class PrintPrimeFactorsOfANumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter a number:");
int number = input.nextInt();

int factor = 2;

while (number != 1){

	if (number % factor == 0){
	number /= factor;
	System.out.print(factor + " x ");

} else 
factor++;

}
}
}
