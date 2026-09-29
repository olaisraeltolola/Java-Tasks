import java.util.Scanner;
public class MultiplicationTableOfOneToAnyNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter a number");
int number = input.nextInt();

for (int index = 1; index <= number; index++){
for (int count = 1; count <= 12; count++){
System.out.println(index + " x " + count + " = " + (index * count));

}
System.out.println();
System.out.println();

}
}
}
