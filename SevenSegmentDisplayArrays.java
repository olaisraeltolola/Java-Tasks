import java.util.Scanner;
public class SevenSegmentDisplayArrays{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		boolean repeat = true;
	

		while(repeat){

			SevenSegmentDisplayArraysFunction.resetDisplay();

			System.out.println("Enter an 8-bit binary number: ");
			String binaryNumber = input.next();

			if (SevenSegmentDisplayArraysFunction.isValid(binaryNumber) == true && SevenSegmentDisplayArraysFunction.isBinary(binaryNumber) == true){



				if (SevenSegmentDisplayArraysFunction.isOn(binaryNumber) == false){
					SevenSegmentDisplayArraysFunction.displayNumber();


				} else {


					if (binaryNumber.charAt(0) == '1'){

						SevenSegmentDisplayArraysFunction.displayFirstSegment(displayArray);
					}



					if (binaryNumber.charAt(1) == '1'){

						SevenSegmentDisplayArraysFunction.displaySecondSegment(displayArray);

					}



					if (binaryNumber.charAt(2) == '1'){

						SevenSegmentDisplayArraysFunction.displayThirdSegment(displayArray);

					}



					if (binaryNumber.charAt(3) == '1'){

						SevenSegmentDisplayArraysFunction.displayFourthSegment(displayArray);


					}



					if (binaryNumber.charAt(4) == '1'){

						SevenSegmentDisplayArraysFunction.displayFifthSegment(displayArray);

					}



					if (binaryNumber.charAt(5) == '1'){
			
						SevenSegmentDisplayArraysFunction.displaySixthSegment(displayArray);

					}



					if (binaryNumber.charAt(6) == '1'){

						SevenSegmentDisplayArraysFunction.displaySeventhSegment(displayArray);

					}


					SevenSegmentDisplayArraysFunction.displayNumber();
				}

			} else {
				System.out.println("Invalid input, please try again");




			}

			System.out.println("Do you want to enter another 8-bit binary number? (yes/no) ");
			String response = input.next();

			if (response.equalsIgnoreCase("no")){
				repeat = false;
			}

		}
	}

}