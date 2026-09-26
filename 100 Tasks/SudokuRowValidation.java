import java.util.Scanner;
public class SudokuRowValidation{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

int number = 0;
int valid = 0;

for (int index = 1; index <= 9; index++){
	for(int counter = 1; index <= 9; index++){

		System.out.println("Enter a number for your Sudoku row");
		number = input.nextInt();

		if ( number <= 9 && number >= 1)
		valid++;

}

if (valid == 9)
System.out.println("Valid row");

else
System.out.println("Number not in range of 1 and 9");
}

}
}


