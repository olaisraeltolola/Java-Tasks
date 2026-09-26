import java.util.Scanner;
public class PasswordTrials{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

int numberOfAttempts = 0;
String password = "";

do{
	System.out.println("Enter the password");
	password = input.nextLine();
	numberOfAttempts++;

if (password.equals("secret123")){
	System.out.println("You are correct");
	break;
}

else 
	System.out.println("You are wrong, please try again");

} while (numberOfAttempts != 3);

if (!password.equals("secret123"))
System.out.println("Account locked");

}
}


