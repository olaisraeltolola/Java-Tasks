import java.util.Scanner;
public class SummationOfInverseOfNumbers{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter a number ");
int number = input.nextInt();

double sum = 0;
double inverse = 0;

for (double index = 1; index <= number; index++){
inverse = (1/index);
sum += inverse;
}

System.out.printf("The sum = %.4f", sum);

}
}
