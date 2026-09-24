import java.util.Scanner;
public class AsteriksPrinting{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.print("Enter a  number, n = ");
int number = input.nextInt();
int counter = 1;

while (counter <= number){
for (int index = 1; index <= counter; index++){
System.out.print("*");
}
counter++;
System.out.print("\t");
}
}
}
