public class DescendingOrderArray{

	public static int[] sortThis(int[] array){

		for (int arrayRow = 0; arrayRow < array.length; arrayRow++){
			for (int index = arrayRow + 1; index < array.length; index++){

				if (array[arrayRow] < array[index]){

					int temporaryVariable = array[arrayRow];
					array[arrayRow] = array[index];
					array[index] = temporaryVariable;

				}
			}

		}
		return array;
	}


}