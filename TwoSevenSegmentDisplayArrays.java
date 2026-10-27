import java.util.Scanner;
public class TwoSevenSegmentDisplayArrays{

	public static char[][] displayFirstArray = {
		{' ',' ',' ',' '},
		{' ',' ',' ',' '},
		{' ',' ',' ',' '},
		{' ',' ',' ',' '},
		{' ',' ',' ',' '},
	};

	public static char[][] displaySecondArray = {
		{' ',' ',' ',' '},
		{' ',' ',' ',' '},
		{' ',' ',' ',' '},
		{' ',' ',' ',' '},
		{' ',' ',' ',' '},
	};


	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		boolean repeat = true;



		while(repeat){

			System.out.println("Enter an 8-bit binary number: ");
			String binaryNumber = input.next();

			if (SevenSegmentDisplayArraysFunction.isValid(binaryNumber) && SevenSegmentDisplayArraysFunction.isBinary(binaryNumber)){

				int firstDecimal = TwoSevenSegmentDisplayArraysFunction.convertFirstHalfToDecimal(binaryNumber);
				int secondDecimal = TwoSevenSegmentDisplayArraysFunction.convertSecondHalfToDecimal(binaryNumber);
	
				char firstSingleDecimal = TwoSevenSegmentDisplayArraysFunction.convertToSingleHex(firstDecimal);
				char secondSingleDecimal = TwoSevenSegmentDisplayArraysFunction.convertToSingleHex(secondDecimal);

				TwoSevenSegmentDisplayArraysFunction.displayHex(firstSingleDecimal, displayFirstArray);
				TwoSevenSegmentDisplayArraysFunction.displayHex(secondSingleDecimal, displaySecondArray);
				TwoSevenSegmentDisplayArraysFunction.displayHexadecimal(displayFirstArray,displaySecondArray);
				repeat = false;

			} else {

				System.out.println("Invalid input, please try again");
			}

		}		




	}
}