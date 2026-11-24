public class CinemaSeatingChartArrayFunctions{

	private static char[][] cinemaArray = {
		{'O','O','O','O','O'},
		{'O','O','O','O','O'},
		{'O','O','O','O','O'},
		{'O','O','O','O','O'},
	};

	public static void displaySeatingArrangement(int rowNumber, int seatNumber){
		for (int arrayRow = 0; arrayRow < 4; arrayRow++){
			int freeSeats = 0;

			System.out.print("Row "+ (arrayRow + 1) + ": ");

			for (int arrayColumn = 0; arrayColumn < 5; arrayColumn++){

				if (isSeatEmpty(arrayRow, arrayColumn)){
					freeSeats++;
				}

				System.out.print(cinemaArray[arrayRow][arrayColumn] + " ");

			}
			System.out.print(" - " + freeSeats + " available");

			System.out.println();
		}
	}


	public static void getSeatPosition(int rowNumber, int seatNumber){
		cinemaArray[rowNumber - 1][seatNumber - 1] = 'X';
	}


	public static boolean isSeatEmpty(int rowNumber, int seatNumber){

		return cinemaArray[rowNumber][seatNumber] == 'O';

	}

}