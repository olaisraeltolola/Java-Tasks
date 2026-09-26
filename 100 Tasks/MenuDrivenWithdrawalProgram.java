import java.util.Scanner;
public class MenuDrivenWithdrawalProgram{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

int menuChoice = 0;
double currentBalance = 0;
do{
String menu = """



---MENU CHOICE---

Please Enter:
1 = Deposit
2 = Withdraw
3 = Check Balance
4 = Exit
""";

System.out.println(menu);
menuChoice = input.nextInt();

switch(menuChoice){
	case 1 -> {System.out.println("How much do you want to deposit");
		double deposit = input.nextDouble();
		currentBalance = deposit; break;}	

	case 2 -> {System.out.println("How much do you want to withdraw");
		double withdrawal = input.nextDouble();
			if (withdrawal > currentBalance)
			System.out.println("You have exceeded the amount in you account");
			else 
			System.out.println("Withdrawal complete");

}
	case 3 -> {System.out.println("Your current balance = " + currentBalance); }

	case 4 -> {System.out.println("You are now leaving"); }

}

} while (menuChoice != 4);

}
}



