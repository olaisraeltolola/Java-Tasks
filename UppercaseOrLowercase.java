import java.util.Scanner;
	public class UppercaseOrLowercase{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter a word");
String word = input.next();

char firstLetter = word.charAt(0);

if (Character.isLetter(firstLetter) && Character.isUpperCase(firstLetter)){
System.out.println("The first letter is uppercase");

} else if (Character.isLetter(firstLetter) && Character.isLowerCase(firstLetter)){
	System.out.println("The first letter is lowercase");

} else { 
	System.out.println("The first letter is not a letter");
}
}
}

