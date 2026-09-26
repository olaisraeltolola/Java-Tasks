import java.util.Scanner;
public class DiceRollingGame{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

int number = 0; 
int rolls = 0;

while (number != 6){
System.out.println("Roll a die (1-6)");
number = input.nextInt();
rolls++;

}

if (rolls < 5)
System.out.println("Lucky!");

else if (rolls >= 5 && rolls <= 10)
System.out.println("Average");

else if (rolls > 5)
System.out.println("Tough luck!");

}
}

