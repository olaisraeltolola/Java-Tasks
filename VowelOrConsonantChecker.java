import java.util.Scanner;
	public class VowelOrConsonantChecker{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter a letter:");
	String letter = input.next();

if (!Character.isLetter(letter.charAt(0)) || letter.length() != 1){
	System.out.println("Invalid input");
return;
} 
char character = letter.charAt(0);

if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U'){
	System.out.println("This letter is a vowel");
} else {
	System.out.println("This is a consonant"); 
}
}
}

		
	
	