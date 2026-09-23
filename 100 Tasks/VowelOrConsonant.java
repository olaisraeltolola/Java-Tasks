import java.util.Scanner;
	public class VowelOrConsonant{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter a letter");
String letter = input.next();

if (letter.length() != 1 || !Character.isLetter(letter.charAt(0)))
	System.out.println("Not a letter");

else if (letter.charAt(0) == 'a' || letter.charAt(0) == 'e' || letter.charAt(0) == 'i' || letter.charAt(0) == 'o' || letter.charAt(0) == 'u' || letter.charAt(0) == 'A' || letter.charAt(0) == 'E' || letter.charAt(0) == 'I' || letter.charAt(0) == 'O' || letter.charAt(0) == 'U')
	System.out.println("Vowel");

else 
	System.out.println("Consonant");

}
}
