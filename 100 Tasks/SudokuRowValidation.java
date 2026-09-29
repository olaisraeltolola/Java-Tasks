import java.util.Scanner;
public class SudokuRowValidation{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

int[][] sudokuArray = new int[9][9];

for (int row = 0; row < 9; row++){

	for (int column = 0; column < 9; column++){

System.out.println("Enter a number between 1 and 9")
int number = input.nextInt();

sudokuArray[row][column] = number; 

}

}

for (int row = 0; row < 9; row++){

	for (int column = 0; column < 9; column++){

System.out.println(sudokuArray[row][column] )

}

}