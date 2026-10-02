public class CombinationMethod{

public int factorial(int number) {

int factorial = 1;

for (int index = number; index >= 1; index--)
	factorial *= index;

return factorial;

}

public double combination(int numberOne, int numberTwo){

double combination = factorial(numberOne)/(factorial(numberOne - numberTwo) * factorial(numberTwo));

return combination;


}
}