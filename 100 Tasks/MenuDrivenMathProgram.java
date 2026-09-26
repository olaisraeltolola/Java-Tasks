import java.util.Scanner;
public class MenuDrivenMathProgram{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
boolean repeat = true;

while (repeat){
String menuChoice = """


---MENU---

Please press:

1. Check if a number is prime
2. Find all factors of a number
3. Print a multiplication table
4 Exit

""";

System.out.println(menuChoice);
int choice = input.nextInt();

switch(choice){
	case 1 -> {	
System.out.println("Enter a number");
int number = input.nextInt();

int counter = 0;
	for(int index = 2; index <= (number/2); index++){
if (number % index == 0)
counter ++;
}

if (number <= 1)
counter ++;

if (counter == 0)
	System.out.printf("%d is a prime number", number);
	
if (counter > 0)
	System.out.printf("%d is not a prime number", number);


}

	case 2 -> {
System.out.println("Enter a number ");
int number = input.nextInt();

int index = 1;

while(index <= number){
if (number % index == 0)
System.out.println("Factors of " + number + " = " + index);
index++;
}

}


	case 3 -> { 
System.out.println("Enter a number");
int number = input.nextInt();


for (int count = 1; count <= 12; count++){
System.out.println(number + " x " + count + " = " + (number * count));
}

} 

	case 4 -> { repeat = false;}

	default -> {System.out.println("Invalid input, please try again");}

}
}
}
}
