import java.util.Scanner;
public class ArrayOfXAndOs{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

char[][] arrayXAndOs = new char[3][3];

for (int row = 0; row < 3; row++){

	for (int column = 0; column < 3; column++){

System.out.println("Enter X or O");
char letter = input.next().charAt(0);

arrayXAndOs[row][column] = letter;
}
}

for (int row = 0; row < 3; row++){

	for (int column = 0; column < 3; column++){

System.out.print(arrayXAndOs[row][column] + " ");
}
System.out.println();
}


System.out.println();
System.out.println();


for (int row = 0; row < 3; row++){

	for (int column = 0; column < 3; column++){

if (arrayXAndOs[row][column] == 'x' || arrayXAndOs[row][column] == 'X')
arrayXAndOs[row][column] = '1';

if (arrayXAndOs[row][column] == 'o' || arrayXAndOs[row][column] == 'O')
arrayXAndOs[row][column] = '0';

System.out.print(arrayXAndOs[row][column] + " ");

}
System.out.println();

}
}
}