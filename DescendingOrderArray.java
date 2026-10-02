public class DescendingOrderArray{

	public static int sortThis(int[] array){

int[] array = new int[]

for (int arrayRow = 0; arrayRow < array.length; arrayRow++){
for (int index = 0; index < array.length; index++){

if (array[arrayRow] > array[index]){
array[index] = array[arrayRow];

} 

}

for (int index = 0; index < array.length; index++){
return array[index]; 
}

}


}