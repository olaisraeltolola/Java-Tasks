public class PrintingATriangleMadeOfStarsUsingFunctions{

	public static void printStar(){

System.out.print("* ");

}

	public static void printSpace(){

System.out.println();

}

	public static void printStar(int number){
for (int index = 1; index <= number; index++){

System.out.print("* ");
}
}


	public static void firstTriangle(int number){
	for (int count = 1; count <= number; count++){
		printStar(count);
		printSpace();
}
}

}