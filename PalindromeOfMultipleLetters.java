import java.util.Scanner;
	
public class PalindromeOfMultipleLetters{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

System.out.println("Enter the word");
String word = input.next();

String reverseWord = "";
String actualWord = "";

for(int index = 0; index < word.length(); index++) {
actualWord = actualWord + word.charAt(index);
}
for(int index = word.length()-1; index >= 0; index--) {
reverseWord = reverseWord + word.charAt(index);
}

if (actualWord.equals(reverseWord)){
System.out.println("This word is a palindrome");

} else { 
	System.out.println("This word is not a palindrome");
}
}
}