import java.util.Scanner;
public class CinemaSeatingChartArray{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		String response = "yes";

		while(response.equalsIgnoreCase("yes")){


			System.out.println("Enter a row number: ");
			int rowNumber = input.nextInt();

			System.out.println("Enter a seat number: ");
			int seatNumber = input.nextInt();


			CinemaSeatingChartArrayFunctions.getSeatPosition(rowNumber, seatNumber);

			CinemaSeatingChartArrayFunctions.displaySeatingArrangement(rowNumber, seatNumber);

			System.out.println("Would you like to reserve another seat? (yes or no)");
			response = input.next();

		}
	}
}