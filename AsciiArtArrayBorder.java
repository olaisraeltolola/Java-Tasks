import java.util.Scanner;
public class AsciiArtArrayBorder{

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

					case "1" -> {displayHeartChoiceWithBorder();}
					case "2" -> {displayHouseChoiceWithBorder();}

				}

				repeat = false;	
			
			} else {
				System.out.println("Please enter 1 or 2");
			}
		}
	}

	public static void displayHeartChoiceWithBorder(){
		Scanner input = new Scanner(System.in);

		boolean repeat = true;

		while(repeat){
			System.out.println("Enter a drawing character: ");
			String drawingCharacter = input.next();

			System.out.println("Enter starting row: ");
			int row = input.nextInt();	

			if (AsciiArtArrayFunctions.isInputSingleCharacter(drawingCharacter)){
				AsciiArtArrayFunctions.printRowSpace(row);

				AsciiArtArrayBorderFunctions.displayHeartWithBorder(drawingCharacter);
				AsciiArtArrayFunctions.printRowSpace(row);

				repeat = false;

			} else {
				System.out.println("Please enter a single character");

			}
		}

	}

	public static void displayHouseChoiceWithBorder(){
		Scanner input = new Scanner(System.in);

		boolean repeat = true;

		while(repeat){
			System.out.println("Enter a drawing character: ");
			String drawingCharacter = input.next();

			System.out.println("Enter starting row: ");
			int row = input.nextInt();

			if (AsciiArtArrayFunctions.isInputSingleCharacter(drawingCharacter)){
				AsciiArtArrayFunctions.printRowSpace(row);

				AsciiArtArrayBorderFunctions.displayHouseWithBorder(drawingCharacter);
				AsciiArtArrayFunctions.printRowSpace(row);

				repeat = false;

			} else {
				System.out.println("Please enter a single character");

			}
		}
	}

}