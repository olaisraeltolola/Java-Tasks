import java.util.Scanner;
public class TicTacToeArray{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

		String gameMenu = """

Please choose an option:

1. Play TicTacToe game
2. Exit

""";

String choice = "";
boolean repeat = true;

		while (repeat){

		System.out.println(gameMenu);
		choice = input.next();
			switch(choice){
				case "1" -> { play_game(); }
				case "2" -> {repeat = false;}
		
			}
		}

	}


	public static void play_game(){
	Scanner input = new Scanner(System.in);

		String response = "yes";

		while (response.equalsIgnoreCase("yes")){

			TicTacToeArrayFunctions.resetBoard();
			TicTacToeArrayFunctions.boardDisplay();

			for (int playerTries = 1; playerTries <= 9; playerTries++){

				if (playerTries % 2 == 0){

					char position = TicTacToeArrayFunctions.position(input, 'O');

					TicTacToeArrayFunctions.playMove('O',position);
	
					TicTacToeArrayFunctions.boardDisplay();

					if (TicTacToeArrayFunctions.detectWinner('O') == true){
						System.out.println("Player O wins!");
						break;
					}


				} else { 
					char position = TicTacToeArrayFunctions.position(input, 'X');

					TicTacToeArrayFunctions.playMove('X',position);

					TicTacToeArrayFunctions.boardDisplay();

					if (TicTacToeArrayFunctions.detectWinner('X') == true){
						System.out.println("Player X wins!");
						break;
					}

				}


			}
			if (TicTacToeArrayFunctions.detectWinner('X') == false && TicTacToeArrayFunctions.detectWinner('O') == false){

				System.out.println("You have tie!");

			}
			System.out.println("Would you like to play again? (yes/no)");
			response = input.next();

		}
	}
	
}