import java.util.Scanner;
public class MergedAsciiArtArray{

	public static void main(String[] args){

		displayCombinedArtChoice();

	}

	public static void displayCombinedArtChoice(){
		Scanner input = new Scanner(System.in);

		boolean repeat = true;

		while(repeat){
			System.out.println("Enter a drawing character: ");
			String drawingCharacter = input.next();

			if (AsciiArtArrayFunctions.isInputSingleCharacter(drawingCharacter)){

				MergedAsciiArtArrayFunctions.displayCombinedHouse(drawingCharacter);
				MergedAsciiArtArrayFunctions.displayCombinedHeart(drawingCharacter);

				MergedAsciiArtArrayFunctions.displayCombinedArt();

				repeat = false;

			} else {
				System.out.println("Please enter a single character");

			}
		}
	}

}