import java.util.Scanner;
public class AsciiArtArray{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

char[][] artArray = {
{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
};


System.out.println("Enter a drawing character: ");
char drawingCharacter = input.next().charAt(0);


for (int arrayRowIndex = 2; arrayRowIndex <= 3; arrayRowIndex++){

	for (int arrayColumnIndex = 0; arrayColumnIndex <= 10; arrayColumnIndex++){

		artArray[arrayRowIndex][arrayColumnIndex] = drawingCharacter;

}
}

	for (int arrayColumnIndex = 1; arrayColumnIndex <= 9; arrayColumnIndex++){

		artArray[4][arrayColumnIndex] = drawingCharacter;

}


	for (int arrayColumnIndex = 2; arrayColumnIndex <= 8; arrayColumnIndex++){

		artArray[5][arrayColumnIndex] = drawingCharacter;

}



	for (int arrayColumnIndex = 3; arrayColumnIndex <= 7; arrayColumnIndex++){

		artArray[6][arrayColumnIndex] = drawingCharacter;

}


	for (int arrayColumnIndex = 4; arrayColumnIndex <= 6; arrayColumnIndex++){

		artArray[7][arrayColumnIndex] = drawingCharacter;

}


artArray[8][5] = drawingCharacter;


	for (int arrayColumnIndex = 0; arrayColumnIndex <= 4; arrayColumnIndex++){

		artArray[1][arrayColumnIndex] = drawingCharacter;

}


	for (int arrayColumnIndex = 6; arrayColumnIndex <= 10; arrayColumnIndex++){

		artArray[1][arrayColumnIndex] = drawingCharacter;

}

	for (int arrayColumnIndex = 1; arrayColumnIndex <= 3; arrayColumnIndex++){

		artArray[0][arrayColumnIndex] = drawingCharacter;

}


	for (int arrayColumnIndex = 7; arrayColumnIndex <= 9; arrayColumnIndex++){

		artArray[0][arrayColumnIndex] = drawingCharacter;

}


for (int row = 0; row <= 8; row++){

	for (int column = 0; column <= 10; column++){

System.out.print(artArray[row][column]);

}
System.out.println();
}
}
}