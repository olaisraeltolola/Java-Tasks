public class SumOfEvenNumbers{
		public static void main(String[] args){
int evenSum = 0;
for (int counter = 1;counter <= 10;counter ++){

if (counter % 2 == 0)
evenSum = evenSum + counter;
}
	System.out.println("The sum of even numbers = " + evenSum);
}
}

