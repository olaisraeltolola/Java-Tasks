public class CountOfNumbersDivisibleByTwoAndThree{
	public static void main(String[] args){

int divisibleByTwo = 0;
int divisibleByThree = 0;
int divisibleByTwoAndThree = 0;
int divisibleByNeither = 0;

for (int index = 1; index <= 10; index++){
if (index % 2 == 0 && index % 3 == 0)
divisibleByTwoAndThree++;

else if (index % 2 == 0)
divisibleByTwo++;

else if (index % 3 == 0)
divisibleByThree++;

else
divisibleByNeither++;
}

System.out.println("Numbers divisible by 2 = " + divisibleByTwo);
System.out.println("Numbers divisible by 3 = " + divisibleByThree);
System.out.println("Numbers divisible by 2 and 3 = " + divisibleByTwoAndThree);
System.out.println("Numbers divisible by neither = " + divisibleByNeither);

}
}