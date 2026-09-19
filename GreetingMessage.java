import java.util.Scanner;
	public class GreetingMessage{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter your name");
String name = input.next();

int lengthOfName = name.length();

if(lengthOfName >= 1 && lengthOfName < 5){
System.out.println("Hi " + name);

} else if(lengthOfName >= 5){
System.out.println("Hello " + name);
}
}
}


