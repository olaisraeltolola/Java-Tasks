import java.util.Scanner;
public class NumbersFromNToOne{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

System.out.println("Enter a number:");
int number = input.nextInt();

System.out.println();

for (int counter = number; counter >= 1; counter--){
System.out.println(counter);

}
}
}