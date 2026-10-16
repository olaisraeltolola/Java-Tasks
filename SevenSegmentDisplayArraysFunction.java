import java.util.Scanner;

public class SevenSegmentDisplayArraysFunction{

	Scanner input = new Scanner(System.in);	

	private static char[][] displayArray = {
		{' ',' ',' ',' '},
		{' ',' ',' ',' '},
		{' ',' ',' ',' '},
		{' ',' ',' ',' '},
		{' ',' ',' ',' '},
	};


	public static void displayNumber(){

		for (int arrayRow = 0; arrayRow < 5; arrayRow++){
			for (int arrayColumn = 0; arrayColumn < 4; arrayColumn++){

				System.out.print(displayArray[arrayRow][arrayColumn] + " ");


			}
			System.out.println();
		}

	}

	public static void resetDisplay(){
		for (int arrayRow = 0; arrayRow < 5; arrayRow++){
			for (int arrayColumn = 0; arrayColumn < 4; arrayColumn++){

				displayArray[arrayRow][arrayColumn] = ' ';


			}
		}



	}


	public static boolean isValid(String binaryByte){

		int lengthOfByte = binaryByte.length();

		if (lengthOfByte == 8){
			return true;
		
		}
		return false;

	}



	public static boolean isBinary(String binaryByte){

		for (int index = 0; index <= 7; index++){

			if (binaryByte.charAt(index) != '0' && binaryByte.charAt(index) != '1'){
				return false;	
			}
		}
		return true;
	}


	public static boolean isOn(String binaryByte){
		if (binaryByte.charAt(7) == '1'){
			return true;
		}
		return false;
	}



	public static void displayFirstSegment(char[][] displayArray){
		for (int arrayIndex = 0; arrayIndex < 4; arrayIndex++){
			displayArray[0][arrayIndex] = '#';
		}

	}


	public static void displaySecondSegment(char[][] displayArray){
		for (int arrayIndex = 0; arrayIndex < 3; arrayIndex++){
			displayArray[arrayIndex][3] = '#';
		}
	}

	public static void displayThirdSegment(char[][] displayArray){
		for (int arrayIndex = 2; arrayIndex < 5; arrayIndex++){
			displayArray[arrayIndex][3] = '#';
		}
	}

	public static void displayFourthSegment(char[][] displayArray){
		for (int arrayIndex = 0; arrayIndex < 4; arrayIndex++){
			displayArray[4][arrayIndex] = '#';

		}

	}

	public static void displayFifthSegment(char[][] displayArray){
		for (int arrayIndex = 2; arrayIndex < 5; arrayIndex++){
			displayArray[arrayIndex][0] = '#';
		}

	}

	public static void displaySixthSegment(char[][] displayArray){
		for (int arrayIndex = 0; arrayIndex < 3; arrayIndex++){
			displayArray[arrayIndex][0] = '#';
		}

	}

	public static void displaySeventhSegment(char[][] displayArray){
		for (int arrayIndex = 0; arrayIndex < 4; arrayIndex++){
			displayArray[2][arrayIndex] = '#';
		}

	}












}