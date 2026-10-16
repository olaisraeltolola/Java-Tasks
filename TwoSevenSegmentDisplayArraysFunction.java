import java.util.Scanner;

public class TwoSevenSegmentDisplayArraysFunction{

	Scanner input = new Scanner(System.in);	


	public static void displayHexadecimal(char[][] displayFirstArray, char[][] displaySecondArray){

		for (int arrayRow = 0; arrayRow < 5; arrayRow++){

			for (int arrayColumn = 0; arrayColumn < 4; arrayColumn++){

				System.out.print(displayFirstArray[arrayRow][arrayColumn] + " ");

			}
			System.out.print("  ");

			for (int arrayColumn = 0; arrayColumn < 4; arrayColumn++){

				System.out.print(displaySecondArray[arrayRow][arrayColumn] + " ");

			}
		System.out.println();
		}

	}

	
	public static int convertFirstHalfToDecimal(String binaryNumber){
		int binaryMultiplier = 8;
		int sumOfDigits = 0;
		for (int index = 0; index < 4; index++){
			int digit = (int) binaryNumber.charAt(index) - (int) '0';
			int multiplication = digit * binaryMultiplier;
			binaryMultiplier /= 2;
			sumOfDigits += multiplication;

		}
		return sumOfDigits;

	}

	public static int convertSecondHalfToDecimal(String binaryNumber){
		int binaryMultiplier = 8;
		int sumOfDigits = 0;
		for (int index = 4; index < 8; index++){
			int digit = (int) binaryNumber.charAt(index) - (int) '0';
			int multiplication = digit * binaryMultiplier;
			binaryMultiplier /= 2;
			sumOfDigits += multiplication;

		}
		return sumOfDigits;

	}


	public static char convertToSingleHex(int numberToConvert){
		char[] hexMap = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

		return hexMap[numberToConvert];
	}



	public static void displayHex(char convertedNumber, char[][] displayArray){


		if (convertedNumber == '0'){
			displayOne(displayArray);

		} else 	if (convertedNumber == '1'){
			displayOne(displayArray);

		} else 	if (convertedNumber == '2'){
			displayTwo(displayArray);

		} else 	if (convertedNumber == '3'){
			displayThree(displayArray);

		} else 	if (convertedNumber == '4'){
			displayFour(displayArray);

		} else 	if (convertedNumber == '5'){
			displayFive(displayArray);

		} else 	if (convertedNumber == '6'){
			displaySix(displayArray);

		} else 	if (convertedNumber == '7'){
			displaySeven(displayArray);

		} else 	if (convertedNumber == '8'){
			displayEight(displayArray);

		} else 	if (convertedNumber == '9'){
			displayNine(displayArray);

		} else 	if (convertedNumber == 'A'){
			displayA(displayArray);

		} else 	if (convertedNumber == 'B'){
			displayB(displayArray);

		} else 	if (convertedNumber == 'C'){
			displayC(displayArray);

		} else 	if (convertedNumber == 'D'){
			displayD(displayArray);

		} else 	if (convertedNumber == 'E'){
			displayE(displayArray);

		} else 	if (convertedNumber == 'F'){
			displayF(displayArray);

		}


	}

	public static char[][] displayZero(char[][] displayArray){

		SevenSegmentDisplayArraysFunction.displayFirstSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySecondSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayThirdSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFourthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFifthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySixthSegment(displayArray);

		return displayArray;


	}

	public static char[][] displayOne(char[][] displayArray){

		SevenSegmentDisplayArraysFunction.displaySecondSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayThirdSegment(displayArray);

		return displayArray;

	}

	public static char[][] displayTwo(char[][] displayArray){

		SevenSegmentDisplayArraysFunction.displayFirstSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySecondSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFourthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFifthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySeventhSegment(displayArray);

		return displayArray;

	}

	public static char[][] displayThree(char[][] displayArray){

		SevenSegmentDisplayArraysFunction.displayFirstSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySecondSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayThirdSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFourthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySeventhSegment(displayArray);

		return displayArray;

	}


	public static char[][] displayFour(char[][] displayArray){

		SevenSegmentDisplayArraysFunction.displaySecondSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayThirdSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySixthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySeventhSegment(displayArray);

		return displayArray;

	}

	public static char[][] displayFive(char[][] displayArray){

		SevenSegmentDisplayArraysFunction.displayFirstSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayThirdSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFourthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySixthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySeventhSegment(displayArray);

		return displayArray;

	}


	public static char[][] displaySix(char[][] displayArray){

		SevenSegmentDisplayArraysFunction.displayFirstSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayThirdSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFourthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFifthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySixthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySeventhSegment(displayArray);

		return displayArray;

	}


	public static char[][] displaySeven(char[][] displayArray){

		SevenSegmentDisplayArraysFunction.displayFirstSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySecondSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayThirdSegment(displayArray);

		return displayArray;

	}


	public static char[][] displayEight(char[][] displayArray){

		SevenSegmentDisplayArraysFunction.displayFirstSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySecondSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayThirdSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFourthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFifthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySixthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySeventhSegment(displayArray);

		return displayArray;

	}


	public static char[][] displayNine(char[][] displayArray){

		SevenSegmentDisplayArraysFunction.displayFirstSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySecondSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayThirdSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySixthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySeventhSegment(displayArray);

		return displayArray;

	}


	public static char[][] displayA(char[][] displayArray){

		SevenSegmentDisplayArraysFunction.displayFirstSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySecondSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayThirdSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFifthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySixthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySeventhSegment(displayArray);

		return displayArray;


	}

	public static char[][] displayB(char[][] displayArray){

		SevenSegmentDisplayArraysFunction.displayThirdSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFourthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFifthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySixthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySeventhSegment(displayArray);

		return displayArray;

	}

	public static char[][] displayC(char[][] displayArray){

		SevenSegmentDisplayArraysFunction.displayFirstSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFourthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFifthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySixthSegment(displayArray);

		return displayArray;

	}

	public static char[][] displayD(char[][] displayArray){

		SevenSegmentDisplayArraysFunction.displaySecondSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayThirdSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFourthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFifthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySeventhSegment(displayArray);

		return displayArray;

	}

	public static char[][] displayE(char[][] displayArray){

		SevenSegmentDisplayArraysFunction.displayFirstSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFourthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFifthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySixthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySeventhSegment(displayArray);

		return displayArray;

	}

	public static char[][] displayF(char[][] displayArray){

		SevenSegmentDisplayArraysFunction.displayFirstSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFifthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySixthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySeventhSegment(displayArray);

		return displayArray;


	}


}
