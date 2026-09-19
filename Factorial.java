import java.util.Scanner;
	public class Factorial{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter a number");
int number = input.nextInt();

long product = 1;
for(int counter = number; counter >= 1; counter--){
product = product * counter;
}
System.out.println(product);
}
}