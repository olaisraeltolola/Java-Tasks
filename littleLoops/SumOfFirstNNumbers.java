import java.util.Scanner;
public class SumOfFirstNNumbers{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

System.out.println("Enter a number:");
int number = input.nextInt();

System.out.println();

int sum = 0;

for (int counter = 1; counter <= number; counter++){
sum += counter;
System.out.println(sum);

}
}
}