import java.util.Scanner;
public class CreditCardValidator{

	public static void main(String [] args){
		Scanner input = new Scanner(System.in);


		System.out.println("Hello, kindly enter card details to verify");
		String cardNumber = input.next();


		if (CreditCardValidatorFunctions.isValid(cardNumber)){

			System.out.println("Credit Card type: "+ CreditCardValidatorFunctions.getCardType(cardNumber));

			System.out.println("Credit Card Number: "+ cardNumber);

			System.out.println("Credit Card Digit length: "+ CreditCardValidatorFunctions.lengthOfNumber(cardNumber));



			if (CreditCardValidatorFunctions.isNumberDivisibleByTen(cardNumber)){

				System.out.println("Credit Card Validity Status: Valid");

			} else 
				System.out.println("Credit Card Validity Status: Invalid");

		}
	}




}