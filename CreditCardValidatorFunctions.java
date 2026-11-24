public class CreditCardValidatorFunctions {


	public static int lengthOfNumber(String cardNumber){
		int lengthOfNumber = cardNumber.length();

		return lengthOfNumber;
	}

	public static boolean isValidLength(String cardNumber){

		if (lengthOfNumber(cardNumber) >= 13 && lengthOfNumber(cardNumber) <= 16){
			return true;

		}
		return false;
	}



	public static int doubleOfDigit(int number){
		return number * 2;
	}



	public static String getCardType(String cardNumber){
		String cardType = "";

		if (cardNumber.charAt(0) == '4'){
			cardType = "Visa Card";


		} else if (cardNumber.charAt(0) == '5'){
			cardType = "MasterCard";


		} else if (cardNumber.charAt(0) == '6'){
			cardType = "Discover Cards";


		} else if (cardNumber.charAt(0) == '3' && cardNumber.charAt(1) == '7'){
			cardType = "American Express Cards";


		} else {

			cardType = "Card type not found";

		}
		return cardType;
	}




	public static int sumOfEvenDigitsFromTheBack(String cardNumber){

		int sumOfNumbers = 0;
		int firstSum = 0;
		
		for (int index = cardNumber.length() - 2; index >= 0; index -= 2){
			char zero = '0';
			
			int number = ((int) cardNumber.charAt(index) - (int) zero);

			int doubleOfNumber = doubleOfDigit(number);

			String stringDoubleOfNumber = String.valueOf(doubleOfNumber);

			if (stringDoubleOfNumber.length() == 1){

				sumOfNumbers += doubleOfNumber;

			} else {

				firstSum = (doubleOfNumber / 10) + (doubleOfNumber % 10);
				sumOfNumbers += firstSum;
			}
		

		}
		return sumOfNumbers;

	}




	public static int sumOfOddDigitsFromTheBack(String cardNumber){
		char zero = '0';

		int sumOfNumbers = 0;

		for (int index = cardNumber.length() - 1; index >= 0; index -= 2){

			int number = ((int) cardNumber.charAt(index) - (int) zero);

			sumOfNumbers += number;
		}
		return sumOfNumbers;
	}





	public static int totalSumOfCalculatedSums(String cardNumber){

		int sumOfEvenDigits = sumOfEvenDigitsFromTheBack(cardNumber);

		int sumOfOddDigits = sumOfOddDigitsFromTheBack(cardNumber);


		return sumOfEvenDigits + sumOfOddDigits;

	}


	public static boolean isNumberDivisibleByTen(String cardNumber){
		if (totalSumOfCalculatedSums(cardNumber) % 10 == 0){
			return true;
		}
		return false;
	}


	public static boolean isValidInput(String cardNumber){
		for (int index = 0; index < cardNumber.length(); index ++){

			if (!Character.isDigit(cardNumber.charAt(index))){
				return false;
			}

		}
		return true;
	}


	public static boolean isValid(String cardNumber){
		if (isValidInput(cardNumber) && isValidLength(cardNumber)){
			return true;
		}
		return false;
	}


}