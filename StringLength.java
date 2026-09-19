import java.util.Scanner;
	public class StringLength{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter a word");
String word = input.nextLine();

int lengthOfWord = word.length();

if (lengthOfWord < 5){
System.out.println("Short string");

} else if (lengthOfWord >= 5 && lengthOfWord <= 10){
System.out.println("Medium string");

} else if (lengthOfWord > 10){
System.out.println("Long string");
}
}
}


