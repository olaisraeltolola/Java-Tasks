import java.util.Scanner;
public class SevenSegmentDisplayArrays{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		boolean repeat = true;
	
while(repeat){
boolean valid = true;

String[][] displayArray = {
{" "," "," "," "},
{" "," "," "," "},
{" "," "," "," "},
{" "," "," "," "},
{" "," "," "," "},
};



System.out.println("Enter an 8-bit binary number: ");
String binaryNumber = input.next();

int lengthOfByte = binaryNumber.length();

if (lengthOfByte != 8){
valid = false;

} else {

for (int index = 0; index <= 7; index++){

if (binaryNumber.charAt(index) != '0' && binaryNumber.charAt(index) != '1'){
valid = false;

}
}


if (binaryNumber.charAt(7) == '0' && lengthOfByte == 8 && valid ){

for (int arrayRow = 0; arrayRow < 5; arrayRow++){
	for (int arrayColumn = 0; arrayColumn < 4; arrayColumn++){

	System.out.print(displayArray[arrayRow][arrayColumn] + " ");


}
System.out.println();
}
}


if (binaryNumber.charAt(0) == '1' && binaryNumber.charAt(7) != '0' && lengthOfByte == 8 && valid){

for (int arrayIndex = 0; arrayIndex < 4; arrayIndex++){
displayArray[0][arrayIndex] = "#";


}

}



if (binaryNumber.charAt(1) == '1' && binaryNumber.charAt(7) != '0' && lengthOfByte == 8 && valid){

for (int arrayIndex = 0; arrayIndex < 3; arrayIndex++){
displayArray[arrayIndex][3] = "#";
}

}



if (binaryNumber.charAt(2) == '1' && binaryNumber.charAt(7) != '0' && lengthOfByte == 8 && valid){

for (int arrayIndex = 2; arrayIndex < 5; arrayIndex++){
displayArray[arrayIndex][3] = "#";
}

}



if (binaryNumber.charAt(3) == '1' && binaryNumber.charAt(7) != '0' && lengthOfByte == 8 && valid){

for (int arrayIndex = 0; arrayIndex < 4; arrayIndex++){
displayArray[4][arrayIndex] = "#";


}

}



if (binaryNumber.charAt(4) == '1' && binaryNumber.charAt(7) != '0' && lengthOfByte == 8 && valid){
for (int arrayIndex = 2; arrayIndex < 5; arrayIndex++){
displayArray[arrayIndex][0] = "#";
}

}



if (binaryNumber.charAt(5) == '1' && binaryNumber.charAt(7) != '0' && lengthOfByte == 8 && valid){

for (int arrayIndex = 0; arrayIndex < 3; arrayIndex++){
displayArray[arrayIndex][0] = "#";
}
}


if (binaryNumber.charAt(6) == '1' && binaryNumber.charAt(7) != '0' && lengthOfByte == 8 && valid){

for (int arrayIndex = 0; arrayIndex < 4; arrayIndex++){
displayArray[2][arrayIndex] = "#";


}

}
if (lengthOfByte == 8 && valid){

for (int arrayRow = 0; arrayRow < 5; arrayRow++){
	for (int arrayColumn = 0; arrayColumn < 4; arrayColumn++){

System.out.print(displayArray[arrayRow][arrayColumn] + " ");

}
System.out.println();
}
		}

	}

if (valid == false)
System.out.println("Invalid input, please try again");

}


}

}