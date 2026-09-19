public class Population{
	public static void main(String[] args){
		long POPULATION = 8_310_000_000L;
		double GROWTH_RATE = 0.0088;

	double populationAfterYearOne = POPULATION *(1 + GROWTH_RATE);
	double populationAfterYearTwo = POPULATION *((1 + GROWTH_RATE)*(1 + GROWTH_RATE));
	double populationAfterYearThree = POPULATION *((1 + GROWTH_RATE)*(1 + GROWTH_RATE)*(1 + GROWTH_RATE));
	double populationAfterYearFour = POPULATION *((1 + GROWTH_RATE)*(1 + GROWTH_RATE)*(1 + GROWTH_RATE)*(1 + GROWTH_RATE));
	double populationAfterYearFive = POPULATION *((1 + GROWTH_RATE)*(1 + GROWTH_RATE)*(1 + GROWTH_RATE)*(1 + GROWTH_RATE)*(1 + GROWTH_RATE));
	System.out.println("Estimated population after 1 year = " + populationAfterYearOne);
	System.out.println("Estimated population after 2 years = " + populationAfterYearTwo);
	System.out.println("Estimated population after 3 years = " + populationAfterYearThree);
	System.out.println("Estimated population after 4 years = " + populationAfterYearFour);
	System.out.println("Estimated population after 5 years = " + populationAfterYearFive);
}
}