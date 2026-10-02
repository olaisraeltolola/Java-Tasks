public class TwoSum{

	public static void main(String[] args){

final int target = 8;
int counter = 0;

int[] twoSumArray = {3,2,4};

int lengthOfArray = twoSumArray.length;

for (int index = 0; index < lengthOfArray; index++){
	for (int secondIndex = index + 1; secondIndex < lengthOfArray; secondIndex++){

if (twoSumArray[index] + twoSumArray[secondIndex] == target){

System.out.print("[" + index + "," + secondIndex + "]");
counter++;


}

	}

		}
if (counter == 0)
System.out.print("0");

	}

}