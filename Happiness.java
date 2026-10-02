public class Happiness{

public static void main(String[]args){

System.out.println(gradeChecker(100, 80));

}



public static String gradeChecker(int numberOne, int numberTwo){

double average = (numberOne + numberTwo)/2;

if(average > 76.2){

return "Proficient: " + average;

}else if(average >= 50 && average <= 76.2){

return "You are getting better: " + average;

}else

return "Get better: " + average;




}






}