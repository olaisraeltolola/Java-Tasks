import java.util.Scanner;
	public class UsernameAndPasswordAuthentication{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

while(true){
System.out.println("Enter your username:");
String username = input.nextLine();

System.out.println("Enter your password:");
String password = input.nextLine();

if (username.equals("admin") && password.equals("1234")){
	System.out.println("Access Granted");
	break;

} else 
	System.out.println("Access Denied");
 
}
}
}