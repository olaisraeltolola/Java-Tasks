import java.util.Scanner;
public class AsciiArtArray{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		boolean repeat = true;

		String artMenu = """

Please choose a picture to display:
1. Heart
2. House

""";


		while (repeat){

			System.out.println(artMenu);
			String artChoice = input.next();

			if (AsciiArtArrayFunctions.isInputOneOrTwo(artChoice)){
				switch(artChoice){

					case "1" -> {displayHeartChoice();}
					case "2" -> {displayHouseChoice();}

				}

				repeat = false;	
			
			} else {
				System.out.println("Please enter 1 or 2");
			}
		}
	}

	public static void displayHeartChoice(){
		Scanner input = new Scanner(System.in);

		boolean repeat = true;

		while(repeat){
			System.out.println("Enter a drawing character: ");
			String drawingCharacter = input.next();

			System.out.println("Enter starting row: ");
			int row = input.nextInt();

			System.out.println("Enter a starting column: ");
			int column = input.nextInt();

	

			if (AsciiArtArrayFunctions.isInputSingleCharacter(drawingCharacter)){
				AsciiArtArrayFunctions.printRowSpace(row);

				AsciiArtArrayFunctions.displayHeart(drawingCharacter, column);
				AsciiArtArrayFunctions.printRowSpace(row);

				repeat = false;

			} else {
				System.out.println("Please enter a single character");

			}
		}

	}

	public static void displayHouseChoice(){
		Scanner input = new Scanner(System.in);

		boolean repeat = true;

		while(repeat){
			System.out.println("Enter a drawing character: ");
			String drawingCharacter = input.next();

			System.out.println("Enter starting row: ");
			int row = input.nextInt();

			System.out.println("Enter a starting column: ");
			int column = input.nextInt();

			if (AsciiArtArrayFunctions.isInputSingleCharacter(drawingCharacter)){
				AsciiArtArrayFunctions.printRowSpace(row);

				AsciiArtArrayFunctions.displayHouse(drawingCharacter, column);
				AsciiArtArrayFunctions.printRowSpace(row);

				repeat = false;

			} else {
				System.out.println("Please enter a single character");

			}
		}
	}

}