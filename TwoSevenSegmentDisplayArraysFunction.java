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

	public static void displayHex(char firstConvertedNumber, char secondConvertedNumber, char[][] displayFirstArray, char[][] displaySecondArray){
		if (firstConvertedNumber == '1' && secondConvertedNumber == '1'){
			displayHexadecimal(displayOne(displayFirstArray), displayOne(displaySecondArray));
		}
	}

	public static void displayZero(char[][] displayArray){

		SevenSegmentDisplayArraysFunction.displayFirstSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySecondSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayThirdSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFourthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFifthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySixthSegment(displayArray);


	}

	public static void displayOne(char[][] displayArray){

		SevenSegmentDisplayArraysFunction.displaySecondSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayThirdSegment(displayArray);

	}

	public static void displayTwo(char[][] displayArray){

		SevenSegmentDisplayArraysFunction.displayFirstSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySecondSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFourthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFifthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySeventhSegment(displayArray);

	}

	public static void displayThree(char[][] displayArray){

		SevenSegmentDisplayArraysFunction.displayFirstSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySecondSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayThirdSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFourthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySeventhSegment(displayArray);

	}


	public static void displayFour(char[][] displayArray){

		SevenSegmentDisplayArraysFunction.displaySecondSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayThirdSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySixthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySeventhSegment(displayArray);


	}

	public static void displayFive(char[][] displayArray){

		SevenSegmentDisplayArraysFunction.displayFirstSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayThirdSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFourthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySixthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySeventhSegment(displayArray);



	}


	public static void displaySix(char[][] displayArray){

		SevenSegmentDisplayArraysFunction.displayFirstSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayThirdSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFourthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFifthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySixthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySeventhSegment(displayArray);



	}


	public static void displaySeven(char[][] displayArray){

		SevenSegmentDisplayArraysFunction.displayFirstSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySecondSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayThirdSegment(displayArray);
	}


	public static void displayEight(char[][] displayArray){

		SevenSegmentDisplayArraysFunction.displayFirstSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySecondSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayThirdSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFourthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFifthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySixthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySeventhSegment(displayArray);

	}


	public static void displayNine(char[][] displayArray){

		SevenSegmentDisplayArraysFunction.displayFirstSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySecondSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayThirdSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySixthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySeventhSegment(displayArray);

	}


	public static void displayA(char[][] displayArray){

		SevenSegmentDisplayArraysFunction.displayFirstSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySecondSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayThirdSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFifthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySixthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySeventhSegment(displayArray);

	}

	public static void displayB(char[][] displayArray){

		SevenSegmentDisplayArraysFunction.displayThirdSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFourthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFifthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySixthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySeventhSegment(displayArray);

	}

	public static void displayC(char[][] displayArray){

		SevenSegmentDisplayArraysFunction.displayFirstSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFourthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFifthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySixthSegment(displayArray);

	}

	public static void displayD(char[][] displayArray){

		SevenSegmentDisplayArraysFunction.displaySecondSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayThirdSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFourthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFifthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySeventhSegment(displayArray);

	}

	public static void displayE(char[][] displayArray){

		SevenSegmentDisplayArraysFunction.displayFirstSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFourthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFifthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySixthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySeventhSegment(displayArray);

	}

	public static void displayF(char[][] displayArray){

		SevenSegmentDisplayArraysFunction.displayFirstSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displayFifthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySixthSegment(displayArray);
		SevenSegmentDisplayArraysFunction.displaySeventhSegment(displayArray);

	}


}
