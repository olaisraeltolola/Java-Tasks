import java.util.Scanner;
public class MenuChoiceOfUser{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

int choice = 0;

do {
String menu = """
--MENU--

Please enter: 

1 = Add
2 = Subtract
3 = Exit

""";
System.out.println(menu);
choice = input.nextInt();

} while (choice != 3);

System.out.println("Thank you for your time!");
}
}