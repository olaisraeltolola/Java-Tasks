import java.util.Scanner;
public class PrintingAllPairsUsingLoops{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

System.out.println("Enter a number:");
int number = input.nextInt();

for (int outerChecker = 1; outerChecker <= number; outerChecker++){
	for (int innerChecker = (outerChecker + 1); innerChecker <= number; innerChecker++){

		if ((outerChecker + innerChecker) % 2 == 0)
			System.out.println(outerChecker+","+innerChecker);

}
}
}
}