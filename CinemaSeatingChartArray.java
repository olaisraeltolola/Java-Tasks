import java.util.Scanner;
public class CinemaSeatingChartArray{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

char[][] cinemaArray = {
{'O','O','O','O','O'},
{'O','O','O','O','O'},
{'O','O','O','O','O'},
{'O','O','O','O','O'},
};




for (int arrayRow = 0; arrayRow < 4; arrayRow++){

	System.out.print("Row "+ (arrayRow + 1) + ": ");

	for (int arrayColumn = 0; arrayColumn < 5; arrayColumn++){

System.out.print(cinemaArray[arrayRow][arrayColumn] + " ");

}
System.out.println();
}



String response = "yes";

while(response.equalsIgnoreCase("yes")){


System.out.println("Enter a row number: ");
int rowNumber = input.nextInt();

System.out.println("Enter a seat number: ");
int seatNumber = input.nextInt();


for (int arrayRow = 0; arrayRow < 4; arrayRow++){
int freeSeats = 0;


	if ((arrayRow + 1) == rowNumber){

		System.out.print("Row "+ (arrayRow + 1) + ": ");

		for (int arrayColumn = 0; arrayColumn < 5; arrayColumn++){

			cinemaArray[rowNumber - 1][seatNumber - 1] = 'X';

			if (cinemaArray[arrayRow][arrayColumn] != 'X'){
				freeSeats++;

}

			System.out.print(cinemaArray[arrayRow][arrayColumn] + " ");

}

	System.out.print(" - " + freeSeats + " available");

	System.out.println();
}

	else {

		System.out.print("Row "+ (arrayRow + 1) + ": ");

		for (int arrayColumn = 0; arrayColumn < 5; arrayColumn++){

			if (cinemaArray[arrayRow][arrayColumn] != 'X'){
				freeSeats++;

}

			System.out.print(cinemaArray[arrayRow][arrayColumn] + " ");

}
		System.out.print(" - " + freeSeats + " available");

		System.out.println();

}

}
System.out.println("Would you like to reserve another seat? (yes or no)");
response = input.next();

}












}
}