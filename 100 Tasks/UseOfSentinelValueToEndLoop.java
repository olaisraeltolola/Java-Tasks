import java.util.Scanner;
public class UseOfSentinelValueToEndLoop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

int number = 0;
System.out.println("Press '-999' to stop inputting");
int count = 0;

while (number != -999){
System.out.println("Enter a number");
number = input.nextInt();
count++;

}
System.out.println((count - 1) + " numbers were entered");

}
}