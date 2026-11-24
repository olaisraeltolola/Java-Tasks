import java.util.Arrays;
public class ThirdLargestDistinctNumber{
	public static void main(String[] args){
		int [] numbers = {12, 5, 23, 18, 7, 10, 11, 20};

		int result = getThirdLargest(numbers);

		System.out.println(result);

	}

	public static int getThirdLargest(int[] numbers){
		int thirdLargest = 0;
		int counter = 0;

		for (int outerloop = 0; outerloop < numbers.length; outerloop++){
			int count = 0;

			for (int innerloop = outerloop + 1; innerloop < numbers.length; innerloop++){

				if (numbers[outerloop] == numbers[innerloop]){
					count++;

				}
			}

			if (count == 0){
				counter++;
			}
		}

		int[] newArray = new int[counter];
		int index = 0;

		for (int outerloop = 0; outerloop < numbers.length; outerloop++){
			int count = 0;

			for (int innerloop = outerloop + 1; innerloop < numbers.length; innerloop++){

				if (numbers[outerloop] == numbers[innerloop]){
					count++;

				}
			}
			if (count == 0){
				newArray[index] = numbers[outerloop];
				index ++;
			}

		}

		for (int outerloop = 0; outerloop < newArray.length; outerloop++){
			for (int innerloop = outerloop + 1; innerloop < newArray.length; innerloop++){

				if (newArray[outerloop] < newArray[innerloop]){

					int temporary = newArray[outerloop];
					newArray[outerloop] = newArray[innerloop];
					newArray[innerloop] = temporary;
				}
			}
		}

		if (newArray.length < 3)
			thirdLargest = -1;

		else
			thirdLargest = newArray[2];


		return thirdLargest;
	}
}