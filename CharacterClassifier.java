import java.util.Scanner;
	public class CharacterClassifier{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter a character");
String character = input.next();

char letter = character.charAt(0);
int lengthOfLetter = character.length();

if(Character.isDigit(letter) && lengthOfLetter == 1){
System.out.println("This character is a digit");

} else if (Character.isLetter(letter) && lengthOfLetter == 1){
System.out.println("This character is a letter");

} else if (lengthOfLetter != 1) {
System.out.println("This is not a character");

} else { 
	System.out.println("This character is a special symbol");
}
}
}




