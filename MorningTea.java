import java.util.Scanner;
	public class MorningTea{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		boolean repeat = true;
 while(repeat){
	System.out.print("Enter a colour: ");
		String colour = input.nextLine();
	
	String firstColour = "Green";
	String secondColour = "Yellow"; 
	String thirdColour = "Red";


if (colour.equalsIgnoreCase(firstColour)){
	System.out.println("Go");
	repeat = false;

} else if (colour.equalsIgnoreCase(secondColour)){
	System.out.println("Get ready");
	repeat = false;

} else if (colour.equalsIgnoreCase(thirdColour)){
	System.out.println("Stop");
	repeat = false;
} else {
	System.out.println("Invalid, go again");
}
}
}
}

