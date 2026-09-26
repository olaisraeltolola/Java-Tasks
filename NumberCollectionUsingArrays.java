import java.util.Scanner;
public class NumberCollectionUsingArrays{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

int number = 0;
int count = 0;
double sum = 0;
double average = 0;

int[] numberCollection = new int[5];

int counter = 0;

for (; counter <= 4; counter++){
System.out.println("Enter a number");
number = input.nextInt();
count++;

sum += number;

numberCollection[counter] = number; 

}
for (int arrayIndex = 0; arrayIndex <= 4; arrayIndex++){
System.out.print(numberCollection[arrayIndex] + " ");

}

int largest = numberCollection[0];
int smallest = largest;

for (int arrayIndex = 0; arrayIndex <= 4; arrayIndex++){

if (numberCollection[arrayIndex] > largest)
largest = numberCollection[arrayIndex];

if (numberCollection[arrayIndex] < smallest)
smallest = numberCollection[arrayIndex];

}
average = sum/count;
System.out.println();

System.out.println("Largest number = " + largest);

System.out.println("Smallest number = " + smallest);

System.out.println("Average of numbers = " + average);

}
}