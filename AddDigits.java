import java.util.Scanner;
public class AddDigits{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a number");
		String number = input.next();

		System.out.println(addDigits(number));


	}

	public static String addDigits(String number){
		int lengthOfNumber = number.length();

		if (lengthOfNumber == 1){
			return number;

		} else {
		
			int sumOfDigits = 0;

			for (int index = 0; index < lengthOfNumber; index++){
				int digit = (int) number.charAt(index) - (int) '0';
				sumOfDigits += digit;
			}

			String stringSumOfDigits = String.valueOf(sumOfDigits);

			return addDigits(stringSumOfDigits);
		}
	}


}