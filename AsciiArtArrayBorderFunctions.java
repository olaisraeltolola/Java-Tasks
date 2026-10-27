public class AsciiArtArrayBorderFunctions{

	private static char[][] artArray = {
				{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
				{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
				{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
				{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
				{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
				{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
				{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
				{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
				{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
	};

	public static void displayArtWithBorder(char[][] artArray){

		System.out.print("+--------------------+");
		System.out.println();
		System.out.println("|		     |");		

		for (int row = 0; row <= 8; row++){
			System.out.print("|    ");

			for (int column = 0; column <= 10; column++){

				System.out.print(artArray[row][column]);

			}
			System.out.print("     |");
			System.out.println();
		}
		System.out.println("|		     |");
		System.out.print("+--------------------+");

	}

	public static void inputDrawingCharacter(int arrayRowIndex, int arrayColumnIndex, String drawingCharacter){
		artArray[arrayRowIndex][arrayColumnIndex] = drawingCharacter.charAt(0);

	}

	public static boolean isInputOneOrTwo(String choice){
		return choice.equals("1") || choice.equals("2");
	}



	public static void inputCharacterInPosition(int rowStart, int rowStop, int columnStart, int columnStop, String drawingCharacter){
		for (int arrayRowIndex = rowStart; arrayRowIndex <= rowStop; arrayRowIndex++){
			for (int arrayColumnIndex = columnStart; arrayColumnIndex <= columnStop; arrayColumnIndex++){

				inputDrawingCharacter(arrayRowIndex, arrayColumnIndex, drawingCharacter);
			}
		}
	}

	public static void displayHeartWithBorder(String drawingCharacter){
		inputCharacterInPosition(2, 3, 0, 10, drawingCharacter);
	
		inputCharacterInPosition(4, 4, 1, 9, drawingCharacter);

		inputCharacterInPosition(5, 5, 2, 8, drawingCharacter);

		inputCharacterInPosition(6, 6, 3, 7, drawingCharacter);

		inputCharacterInPosition(7, 7, 4, 6, drawingCharacter);

		inputDrawingCharacter(8, 5, drawingCharacter);

		inputCharacterInPosition(1, 1, 0, 4, drawingCharacter);

		inputCharacterInPosition(1, 1, 6, 10, drawingCharacter);

		inputCharacterInPosition(0, 0, 1, 3, drawingCharacter);

		inputCharacterInPosition(0, 0, 7, 9, drawingCharacter);

		displayArtWithBorder(artArray);

	}

	public static void displayHouseWithBorder(String drawingCharacter){
		inputCharacterInPosition(6, 8, 3, 7, drawingCharacter);
	
		inputCharacterInPosition(5, 5, 0, 10, drawingCharacter);

		inputCharacterInPosition(4, 4, 1, 9, drawingCharacter);

		inputCharacterInPosition(3, 3, 2, 8, drawingCharacter);

		inputCharacterInPosition(2, 2, 3, 7, drawingCharacter);

		inputCharacterInPosition(1, 1, 4, 6, drawingCharacter);

		inputDrawingCharacter(0, 5, drawingCharacter);

		displayArtWithBorder(artArray);


	}

	public static void printRowSpace(int row){
		for (int space = 1; space <= row; space++){
			System.out.println();
		}

	}


}