public class FizzBuzzSequence{
	public static void main(String[] args){

for (int index = 1; index <= 50; index++){
	if (index % 3 == 0 && index % 5 == 0)
	System.out.println("FizzBuzz");

	if (index % 3 == 0)
	System.out.println("Fizz");

	else if (index % 5 == 0)
	System.out.println("Buzz");

	else
	System.out.println(index);
}
}
}

