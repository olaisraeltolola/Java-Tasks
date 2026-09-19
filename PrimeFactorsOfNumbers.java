import java.util.Scanner;
	
public class PrimeFactorsOfNumbers{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

System.out.println("Enter a number");
int numberOne = input.nextInt();

int index = 2;
while(numberOne != 1){

if (numberOne % index == 0){
numberOne = numberOne / index;
System.out.println(index);

} else {
index++;
}
}
}
}


