public class NumberSwayInAnArray{

	public static int[] numberSwap(int[] array){

array = new int[];

for (int arrayRow = 0; arrayRow < array.length; arrayRow++){


if (arrayRow % 2 == 0){
arrayRow = arrayRow + 1;

else
arrayRow = arrayRow - 1;

}

}

if (array.length % 2 != 0){
array[arrayRow] = array[array.length - 1] 


return array;
}
}