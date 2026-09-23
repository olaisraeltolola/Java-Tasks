import java.util.Scanner;
public class TriangleCategorization{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter the first side of the triangle");
int sideOne = input.nextInt();

System.out.println("Enter the second side of the triangle");
int sideTwo = input.nextInt();

System.out.println("Enter the third side of the triangle");
int sideThree = input.nextInt();

if (sideOne <= 0 || sideTwo <= 0 || sideThree <= 0)
System.out.println("This does not form a valid triangle");

else if (sideOne == sideTwo && sideTwo == sideThree)
System.out.println("This triangle is equilateral");

else if (sideOne == sideTwo || sideTwo == sideThree || sideOne == sideThree)
System.out.println("This triangle is isosceles");

else if (sideOne != sideTwo && sideTwo != sideThree && sideOne != sideThree)
System.out.println("This triangle is scalene");


}
}



