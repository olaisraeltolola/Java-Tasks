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


		System.out.println("Enter an 8-bit binary number: ");
		String binaryNumber = input.next();

/*		if (binaryNumber.charAt(0) == '1' && binaryNumber.charAt(1) == '1' && binaryNumber.charAt(2) == '0' && binaryNumber.charAt(3) == '1' && binaryNumber.charAt(4) == '0' && binaryNumber.charAt(5) == '1' && binaryNumber.charAt(6) == '0' && binaryNumber.charAt(7) == '1'){

			TwoSevenSegmentDisplayArraysFunction.displayD(displayFirstArray);
			TwoSevenSegmentDisplayArraysFunction.displayFive(displaySecondArray);
			TwoSevenSegmentDisplayArraysFunction.displayHexadecimal(displayFirstArray,displaySecondArray);

		}*/

		int firstDecimal = TwoSevenSegmentDisplayArraysFunction.convertFirstHalfToDecimal(binaryNumber);
		int secondDecimal = TwoSevenSegmentDisplayArraysFunction.convertSecondHalfToDecimal(binaryNumber);

		char firstSingleDecimal = TwoSevenSegmentDisplayArraysFunction.convertToSingleHex(firstDecimal);
		char secondSingleDecimal = TwoSevenSegmentDisplayArraysFunction.convertToSingleHex(secondDecimal);

		TwoSevenSegmentDisplayArraysFunction.displayHex(firstSingleDecimal, displayFirstArray);
		TwoSevenSegmentDisplayArraysFunction.displayHex(secondSingleDecimal, displaySecondArray);
		TwoSevenSegmentDisplayArraysFunction.displayHexadecimal(displayFirstArray,displaySecondArray);




		




	}
}