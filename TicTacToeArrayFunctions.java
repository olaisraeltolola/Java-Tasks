import java.util.Scanner;
public class TicTacToeArrayFunctions{

	Scanner input = new Scanner(System.in);	

	private static char[][] board = {
			{'1','2','3'},
			{'4','5','6'},
			{'7','8','9'}
	};

	public static void resetBoard(){

		char position = '1';
		for (int arrayRow = 0; arrayRow < board.length; arrayRow++){
			for (int arrayColumn = 0; arrayColumn < board.length; arrayColumn++){
				board[arrayRow][arrayColumn] = position;
				position++;
			}
		}

	}


	public static void boardDisplay(){


		for (int arrayRow = 0; arrayRow < board.length; arrayRow++){
			for (int arrayColumn = 0; arrayColumn < board.length; arrayColumn++){
				System.out.print(board[arrayRow][arrayColumn] + " ");
			}
			System.out.println();
		}

	}


	public static char position(Scanner input, char player){

		String selectedPosition = "";

		System.out.println("Player " + player + " select a position (1-9): ");
		selectedPosition = input.next();

		while(selectedPosition.length() != 1 || isValid(selectedPosition.charAt(0)) != true || isPositionEmpty(selectedPosition.charAt(0)) != true){
			boardDisplay();

			System.out.println("Invalid input, please select a position (1-9): ");
			selectedPosition = input.next();

		}


	return selectedPosition.charAt(0);

	}

	public static boolean isValid(char position){
	
	if (position > '9' || position < '1')
		return false;
	else
		return true;

	}

	public static void playMove(char player, char position){


		switch(position){
			case '1' -> {board[0][0] = player;}
			case '2' -> {board[0][1] = player;}
			case '3' -> {board[0][2] = player;}
			case '4' -> {board[1][0] = player;}
			case '5' -> {board[1][1] = player;}
			case '6' -> {board[1][2] = player;}
			case '7' -> {board[2][0] = player;}
			case '8' -> {board[2][1] = player;}
			case '9' -> {board[2][2] = player;}
		}



	}


	public static boolean isPositionEmpty(char position){

		return switch(position){
			case '1' -> board[0][0] != 'X' && board[0][0] != 'O';
			case '2' -> board[0][1] != 'X' && board[0][1] != 'O';
			case '3' -> board[0][2] != 'X' && board[0][2] != 'O';
			case '4' -> board[1][0] != 'X' && board[1][0] != 'O';
			case '5' -> board[1][1] != 'X' && board[1][1] != 'O';
			case '6' -> board[1][2] != 'X' && board[1][2] != 'O';
			case '7' -> board[2][0] != 'X' && board[2][0] != 'O';
			case '8' -> board[2][1] != 'X' && board[2][1] != 'O';
			case '9' -> board[2][2] != 'X' && board[2][2] != 'O';
			default -> false;
		};




	}


	public static boolean detectWinner(char player){

		for (int arrayRow = 0; arrayRow <= 2; arrayRow++){
			if (board[arrayRow][0] == player && board[arrayRow][1] == player && board[arrayRow][2] == player)
				return true;
				

		}

		for (int arrayColumn = 0; arrayColumn <= 2; arrayColumn++){
			if (board[0][arrayColumn] == player && board[1][arrayColumn] == player && board[2][arrayColumn] == player)
				return true;
				

		}

		if (board[0][0] == player && board[1][1] == player && board[2][2] == player){
			return true;
		}

		if (board[0][2] == player && board[1][1] == player && board[2][0] == player){
			return true;
		}


	return false;
	}





}