public class CombinationMethod{

public static int factorial(int number) {

int factorial = 1;

for (int index = number; index >= 1; index--)
	factorial *= index;

return factorial;

}

public static double combination(int numberOne, int numberTwo){

double combination = factorial(numberOne)/(factorial(numberOne - numberTwo) * factorial(numberTwo));

return combination;


}
}