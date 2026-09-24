public class PrimeNumbersFromOneToHundred{
	public static void main(String[] args){

int countOfPrimeNumbers = 0;
for(int dividend = 1; dividend <= 100; dividend++){
int counter = 0;

for(int divisor = 2; divisor < dividend; divisor++){

	if (dividend % divisor == 0)
	counter++;
}

	if (counter == 0 && dividend != 1){
	System.out.println(dividend);
	countOfPrimeNumbers++;
}
}
System.out.println("Number of prime numbers = " + countOfPrimeNumbers);
}
}