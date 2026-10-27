public class MergedAsciiArtArrayFunctions{

	private static char[][] artArray = {
				{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
				{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
				{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
				{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
				{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
				{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
				{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
				{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
				{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
	};

	public static void displayCombinedArt(){

		for (int row = 0; row <= 8; row++){
 
			for (int column = 0; column <= 23; column++){

				System.out.print(artArray[row][column]);

			}
			System.out.println();
		}

	}


	public static void inputDrawingCharacter(int arrayRowIndex, int arrayColumnIndex, String drawingCharacter){
		artArray[arrayRowIndex][arrayColumnIndex] = drawingCharacter.charAt(0);

	}


	public static void inputCharacterInPosition(int rowStart, int rowStop, int columnStart, int columnStop, String drawingCharacter){
		for (int arrayRowIndex = rowStart; arrayRowIndex <= rowStop; arrayRowIndex++){
			for (int arrayColumnIndex = columnStart; arrayColumnIndex <= columnStop; arrayColumnIndex++){

				inputDrawingCharacter(arrayRowIndex, arrayColumnIndex, drawingCharacter);
			}
		}
	}


	public static void displayCombinedHeart(String drawingCharacter){
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

	}

	public static void displayCombinedHouse(String drawingCharacter){
		inputCharacterInPosition(6, 8, 16, 20, drawingCharacter);
	
		inputCharacterInPosition(5, 5, 13, 23, drawingCharacter);

		inputCharacterInPosition(4, 4, 14, 22, drawingCharacter);

		inputCharacterInPosition(3, 3, 15, 21, drawingCharacter);

		inputCharacterInPosition(2, 2, 16, 20, drawingCharacter);

		inputCharacterInPosition(1, 1, 17, 19, drawingCharacter);

		inputDrawingCharacter(0, 18, drawingCharacter);

	}


}