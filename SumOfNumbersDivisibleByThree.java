public class SumOfNumbersDivisibleByThree{
		public static void main(String[] args){

int sum = 0;
for (int counter = 1;counter <= 30;counter ++){
if (counter % 3 == 0)
sum += counter;
}
System.out.println("The sum of the integers divisible by three between 1 and 30 = " + sum);
}
}
