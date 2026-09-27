public class Kata {

	public static int maximumOfTwoNumbers (int numberOne, int numberTwo){

int maximum = 0;
		if (numberOne > numberTwo)
			maximum = numberOne;
		else
			maximum = numberTwo;

		return maximum;

}

	public static double maximumOfTwoNumbers (double numberOne, int numberTwo){

double maximum = 0;
		if (numberOne > numberTwo)
			maximum = numberOne;
		else
			maximum = numberTwo;

		return maximum;

}

	public static double maximumOfTwoNumbers (int numberOne, double numberTwo){

double maximum = 0;
		if (numberOne > numberTwo)
			maximum = numberOne;
		else
			maximum = numberTwo;

		return maximum;

}


	public static double maximumOfTwoNumbers (double numberOne, double numberTwo){

double maximum = 0;
		if (numberOne > numberTwo)
			maximum = numberOne;
		else
			maximum = numberTwo;

		return maximum;

}


	public static boolean isEven (int number){

		if (number % 2 == 0)
			return true;
		else
			return false;

}

	public static boolean isPrimeNumber (int number){

int count = 0;

	for (int index = 2; index < number; index ++){
		if (number % index == 0)
		count++;
}
if (count == 0)
	return true;

else
	return false;

}

	public static int subtract (int numberOne, int numberTwo){

		if (numberOne > numberTwo)
			return numberOne - numberTwo;
		else
			return numberTwo - numberOne;

}


	public static float divide (float numberOne, float numberTwo){

		if (numberTwo == 0)
			return 0;
		else
			return numberOne / numberTwo;

}


	public static int factorOf (int number){

int count = 0;

	for (int index = 1; index <= number; index ++){
		if (number % index == 0)
		count++;
}
	return count;
}


	public static boolean isPerfectSquare (int number){

		if (number % (Math.sqrt(number)) == 0)
		return true;

		else 
		return false;
}

}
			