import java.util.Arrays;

public class TrialForPerfectSquareArray{
	public static void main(String[] args){

	int[] numberArray = {2,4,6,25,10,36,49,18,1,78,100};

	int[] perfectSquareArray = getPerfectSquare(numberArray);

	int count = 0;
	for (int index = 0; index < perfectSquareArray.length; index++){
		if (perfectSquareArray[index] != 0){
			count++;
		}
	}
	
	int[] cleanPerfectSquareArray = new int[count];

	for (int index = 0; index < cleanPerfectSquareArray.length; index++){
		cleanPerfectSquareArray[index] = perfectSquareArray[index];

	}
	System.out.print(Arrays.toString(cleanPerfectSquareArray));

	}





	public static int[] getPerfectSquare(int[] numberList){

		int[] newArray = new int[numberList.length];
		int arrayIndex = 0;

		for (int index = 0; index < numberList.length; index++){
			double squareRootOfNumber = Math.sqrt(numberList[index]);
			int integerSquareRootOfNumber = (int) squareRootOfNumber;

			if (numberList[index] / squareRootOfNumber == integerSquareRootOfNumber){
				newArray[arrayIndex] = numberList[index];
				arrayIndex++;
			}
		}
		return newArray;
	}
}