import java.util.Scanner;
	public class RockPaperScissorsGame{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Player one move:");
String playerOneMove = input.next();

System.out.println("Player two move:");
String playerTwoMove = input.next();

String moveOne = "Rock";
String moveTwo = "Paper";
String moveThree = "Scissors";

if (playerOneMove.equalsIgnoreCase(moveOne) && playerTwoMove.equalsIgnoreCase(moveTwo)){
	System.out.println("Player Two wins!");

} else if (playerOneMove.equalsIgnoreCase(moveOne) && playerTwoMove.equalsIgnoreCase(moveThree)){
	System.out.println("Player One wins!");

} else if (playerOneMove.equalsIgnoreCase(moveTwo) && playerTwoMove.equalsIgnoreCase(moveOne)){
	System.out.println("Player One wins!");

} else if (playerOneMove.equalsIgnoreCase(moveTwo) && playerTwoMove.equalsIgnoreCase(moveThree)){
	System.out.println("Player Two wins!");

} else if (playerOneMove.equalsIgnoreCase(moveThree) && playerTwoMove.equalsIgnoreCase(moveOne)){
	System.out.println("Player Two wins!");

} else if (playerOneMove.equalsIgnoreCase(moveThree) && playerTwoMove.equalsIgnoreCase(moveTwo)){
	System.out.println("Player One wins!");

} else { 
	System.out.println("Tie!");  
}

}
}
