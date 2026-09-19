import java.util.Scanner;
	public class Palindrome {
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter a 3-letter word");
String word = input.next();

int lengthOfWord = word.length();

char firstLetter = word.charAt(0);
char secondLetter = word.charAt(1);
char thirdLetter = word.charAt(2);

if (firstLetter == thirdLetter && lengthOfWord == 3){
System.out.println("This word is a palindrome");

} else if (firstLetter != thirdLetter && lengthOfWord == 3){
System.out.println("This word is not a palindrome");

} else {
	System.out.println("This is not a 3-letter word");
}
}
}


