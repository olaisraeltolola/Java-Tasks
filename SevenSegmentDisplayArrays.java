import java.util.Scanner;
public class SevenSegmentDisplayArrays{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

String[][] displayArray = {
{" "," "," "," "},
{" "," "," "," "},
{" "," "," "," "},
{" "," "," "," "},
{" "," "," "," "},
};


System.out.println("Enter an 8-bit binary number: ");
String binaryNumber = input.next();

if (binaryNumber.charAt(7) == '0'){

for (int arrayRow = 0; arrayRow < 5; arrayRow++){
	for (int arrayColumn = 0; arrayColumn < 4; arrayColumn++){

	System.out.print(displayArray[arrayRow][arrayColumn] + " ");


}
System.out.println();

}
return;
}



if (binaryNumber.charAt(0) == '1'){

for (int arrayIndex = 0; arrayIndex < 4; arrayIndex++){
displayArray[0][arrayIndex] = "#";


}

}



if (binaryNumber.charAt(1) == '1'){
displayArray[1][3] = "#";
displayArray[0][3] = "#";

}



if (binaryNumber.charAt(2) == '1'){
displayArray[3][3] = "#";
displayArray[4][3] = "#";

}



if (binaryNumber.charAt(3) == '1'){

for (int arrayIndex = 0; arrayIndex < 4; arrayIndex++){
displayArray[4][arrayIndex] = "#";


}

}



if (binaryNumber.charAt(4) == '1'){
for (int arrayIndex = 2; arrayIndex < 5; arrayIndex++){
displayArray[arrayIndex][0] = "#";
}

}



if (binaryNumber.charAt(5) == '1'){

for (int arrayIndex = 0; arrayIndex < 3; arrayIndex++){
displayArray[arrayIndex][0] = "#";
}
}


if (binaryNumber.charAt(6) == '1'){

for (int arrayIndex = 0; arrayIndex < 4; arrayIndex++){
displayArray[2][arrayIndex] = "#";


}

} else {

displayArray[2][3] = "#";

}



for (int arrayRow = 0; arrayRow < 5; arrayRow++){
	for (int arrayColumn = 0; arrayColumn < 4; arrayColumn++){

	System.out.print(displayArray[arrayRow][arrayColumn] + " ");


}
System.out.println();
}

}


}