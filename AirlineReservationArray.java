import java.util.Scanner;
public class AirlineReservationArray{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

char[][] airfrontArray = {
{'O','O','O','O'},
{'O','O','O','O'},
{'O','O','O','O'},
{'O','O','O','O'},
{'O','O','O','O'},
{'O','O','O','O'},
};

System.out.println("Welcome to the Airline Reservation System");
System.out.println();

System.out.println("       A B C D");

for (int arrayRow = 0; arrayRow < 6; arrayRow++){

System.out.print("Row " + (arrayRow + 1) + ": ");

	for (int arrayColumn = 0; arrayColumn < 4; arrayColumn++){


System.out.print(airfrontArray[arrayRow][arrayColumn] + " ");

}

System.out.println();
}

String response = "yes";

while (response.equalsIgnoreCase("yes")){

System.out.println("Enter a row number:");
int rowNumber = input.nextInt();

System.out.println("Enter a seat letter:");
char seatLetter = input.next().charAt(0);


System.out.println();
System.out.println("Seat " + rowNumber + seatLetter + " has been reserved");
System.out.println();


System.out.println("       A B C D");

for (int arrayRow = 0; arrayRow < 6; arrayRow++){

System.out.print("Row " + (arrayRow + 1) + ": ");

	for (int arrayColumn = 0; arrayColumn < 4; arrayColumn++){

if (seatLetter == 'A' || seatLetter == 'a')
airfrontArray[rowNumber - 1][0] = 'X';

if (seatLetter == 'B' || seatLetter == 'b')
airfrontArray[rowNumber - 1][1] = 'X';

if (seatLetter == 'C' || seatLetter == 'c')
airfrontArray[rowNumber - 1][2] = 'X';

if (seatLetter == 'D' || seatLetter == 'd')
airfrontArray[rowNumber - 1][3] = 'X';


System.out.print(airfrontArray[arrayRow][arrayColumn] + " ");

}
System.out.println();
}

System.out.println("Would you like to reserve another seat? (yes or no)");
response = input.next();


	}

}
}
