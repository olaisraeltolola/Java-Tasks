import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class CreditCardValidatorTest{

	@ Test
	public void testThatTheInputIsNotEmpty(){

		boolean actual = CreditCardValidatorFunctions.isValidLength("");

		Assertions.assertFalse(actual);

	}

	@ Test
	public void testTheLengthOfTheCardNumber(){

		int actual = CreditCardValidatorFunctions.lengthOfNumber("3229735454563435");
		int expected = 16;

		Assertions.assertEquals(actual, expected);

	}



	@ Test
	public void testThatTheInputIsValidLength(){

		boolean actual = CreditCardValidatorFunctions.isValidLength("32294563345435");
		boolean expected = true;

		Assertions.assertEquals(actual, expected);

	}


	@ Test
	public void testThatTheInputAreNumbers(){

		boolean actual = CreditCardValidatorFunctions.isValidInput("4384324354563435");
		boolean expected = true;

		Assertions.assertEquals(actual, expected);

	}


	@ Test
	public void testThatTheCardTypeIsVisaCardIfTheFirstDigitIs4(){

		String actual = CreditCardValidatorFunctions.getCardType("4229735454563435");
		String expected = "Visa Card";

		Assertions.assertEquals(actual, expected);

	}


	@ Test
	public void testThatTheCardTypeIsMasterCardIfTheFirstDigitIs4(){

		String actual = CreditCardValidatorFunctions.getCardType("5229735454563435");
		String expected = "MasterCard";

		Assertions.assertEquals(actual, expected);

	}


	@ Test
	public void testThatTheCardTypeIsAmericanExpressCardIfTheFirstDigitIs4(){

		String actual = CreditCardValidatorFunctions.getCardType("3729735454563435");
		String expected = "American Express Cards";

		Assertions.assertEquals(actual, expected);

	}

	@ Test
	public void testThatTheCardTypeIsDiscoverCardIfTheFirstDigitIs4(){

		String actual = CreditCardValidatorFunctions.getCardType("6229735454563435");
		String expected = "Discover Cards";

		Assertions.assertEquals(actual, expected);

	}


	@ Test
	public void testDoubleOfANumber(){

		int actual = CreditCardValidatorFunctions.doubleOfDigit(2);
		int expected = 4;

		Assertions.assertEquals(actual, expected);

	}

	@ Test
	public void testTheSumOfEvenDigitsFromTheBack(){

		int actual = CreditCardValidatorFunctions.sumOfEvenDigitsFromTheBack("4388576018402626");
		int expected = 37;

		Assertions.assertEquals(actual, expected);

	}

	@ Test
	public void testTheSumOfOddDigitsFromTheBack(){

		int actual = CreditCardValidatorFunctions.sumOfOddDigitsFromTheBack("4388576018402626");
		int expected = 38;

		Assertions.assertEquals(actual, expected);

	}


	@ Test
	public void testTheSumOfAllSummedDigits(){

		int actual = CreditCardValidatorFunctions.totalSumOfCalculatedSums("4388576018402626");
		int expected = 75;

		Assertions.assertEquals(actual, expected);

	}

	@ Test
	public void testThatTheSumOfAllSummedDigitsIsDivisibleByTen(){

		boolean actual = CreditCardValidatorFunctions.isNumberDivisibleByTen("5399833201395953");
		boolean expected = true;

		Assertions.assertEquals(actual, expected);

	}

	


}