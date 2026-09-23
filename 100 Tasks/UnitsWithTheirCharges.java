import java.util.Scanner;
	public class UnitsWithTheirCharges{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter the number of units");
int numberOfUnits = input.nextInt();

if (numberOfUnits >=0 && numberOfUnits <= 100)
	System.out.printf("Your bill = N%d", numberOfUnits * 50);

else if (numberOfUnits > 100 && numberOfUnits <= 300)
	System.out.printf("Your bill = N%d", numberOfUnits * 75);

else if (numberOfUnits > 300 )
	System.out.printf("Your bill = N%d", numberOfUnits * 100);

else 
	System.out.println("Invalid input");

}
}

