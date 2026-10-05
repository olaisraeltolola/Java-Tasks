import java.util.Scanner;
public class ReverseWordAndNumberOfVowels{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	char[] vowels ={'a','e','i','o','u','A','E','I','O','U'};

	System.out.println("Enter a word: ");
	String word = input.nextLine().toLowerCase();

	int counter = 0;
	int count = 0;
	int secondCount = 0;

	String reverseWord = "";

	for (int index = (word.length() - 1); index >= 0; index--){

	reverseWord += word.charAt(index); 

	for (int arrayIndex = 0; arrayIndex < vowels.length; arrayIndex++){
	if (word.charAt(index) == vowels[arrayIndex]){
	counter++;
}

}


} 

	for (int outerLoop = 0; outerLoop < word.length(); outerLoop++){
	for (int innerLoop = outerLoop + 1; innerLoop < word.length(); innerLoop++){
			
	if (word.charAt(outerLoop) == word.charAt(innerLoop)){

	System.out.print(word.charAt(outerLoop) + " ");
	count++;
}
}
}
	System.out.println();


	for (int index = 0; index < word.length(); index++){

	secondCount = 0;	

	for (int arrayIndex = 0; arrayIndex < vowels.length; arrayIndex++){

	if (reverseWord.charAt(index) == vowels[arrayIndex]){
	secondCount++;
}
}
	if (secondCount == 0)
	
	System.out.print(index + " ");

}

	if (count == 0)
	System.out.println("0");

	System.out.println();
	System.out.println("Reversed word = " + reverseWord);
	System.out.println("The number of vowels = " + counter);


}

}