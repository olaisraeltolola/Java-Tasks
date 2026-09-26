public class PrimeNumbersBetweenTwoAndFifty{
	public static void main(String[] args){

for (int dividend = 2; dividend <= 50; dividend++){
int counter = 0;
	for(int divisor = 2; divisor < dividend; divisor++){
		if (dividend % divisor == 0)
		counter++;
}

if (counter == 0)
System.out.println(dividend);
}
}
}
