public class Try{
	public static void main(String[] args){

int sum = 0;

for (int n = 1; n <= 10; n++){
	if (n % 2 == 0){
		sum += n;
		System.out.println("Added: " + n);
}
}
System.out.println("Sum: " + sum);

}
}