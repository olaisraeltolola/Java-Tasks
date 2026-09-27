import java.util.Scanner;
public class NumbersFromOneToN{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

System.out.println("Enter a number:");
int number = input.nextInt();

System.out.println();

for (int counter = 1; counter <= number; counter++){
System.out.println(counter);

}
}
}