import java.util.Scanner;
	public class TicTacToeArray{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

char[][] ticTacToeArray = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};

for (int row = 0; row < 3; row++){
	for (int column = 0; column < 3; column++){

if ((row == 0 && column == 1) || (row == 1 && column == 0) || (row == 1 && column == 2) || (row == 2 && column == 1)){
	System.out.println("Player O, select a position (1-9):");
	char position = input.next().charAt(0); 

switch(position){
case '1' -> {ticTacToeArray[0][0] = 'O';}
case '2' -> {ticTacToeArray[0][1] = 'O';}
case '3' -> {ticTacToeArray[0][2] = 'O';}
case '4' -> {ticTacToeArray[1][0] = 'O';}
case '5' -> {ticTacToeArray[1][1] = 'O';}
case '6' -> {ticTacToeArray[1][2] = 'O';}
case '7' -> {ticTacToeArray[2][0] = 'O';}
case '8' -> {ticTacToeArray[2][1] = 'O';}
case '9' -> {ticTacToeArray[2][2] = 'O';}
}

for (int arrayRow = 0; arrayRow < 3; arrayRow++){
	for (int arrayColumn = 0; arrayColumn < 3; arrayColumn++){
		System.out.print(ticTacToeArray[arrayRow][arrayColumn] + " ");
}
System.out.println();
}

} else { 
	System.out.println("Player X, select a position (1-9):");
	char position = input.next().charAt(0); 

switch(position){
case '1' -> {ticTacToeArray[0][0] = 'X';}
case '2' -> {ticTacToeArray[0][1] = 'X';}
case '3' -> {ticTacToeArray[0][2] = 'X';}
case '4' -> {ticTacToeArray[1][0] = 'X';}
case '5' -> {ticTacToeArray[1][1] = 'X';}
case '6' -> {ticTacToeArray[1][2] = 'X';}
case '7' -> {ticTacToeArray[2][0] = 'X';}
case '8' -> {ticTacToeArray[2][1] = 'X';}
case '9' -> {ticTacToeArray[2][2] = 'X';}
}

for (int arrayRow = 0; arrayRow < 3; arrayRow++){
	for (int arrayColumn = 0; arrayColumn < 3; arrayColumn++){
		System.out.print(ticTacToeArray[arrayRow][arrayColumn] + " ");
}
System.out.println();
}
}

			}

		}

	}
	
}