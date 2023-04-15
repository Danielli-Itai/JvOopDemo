package arrays_pckg;

/**
 * 
 * @author Itai
 * Geometric progression calculation.
 *
 */
public class ProgressGeomet
{	
	//	Create an array for the series numbers.
	public static int[] Items(int count, int step) {
		int member = 1;
		int[] result = new int[count];
		
		for(int i=1; i<=count; i+= step) {
			member *= i;
			result[i-1] = member;
		}
		return result;
	}

	//	Get the summation of the series.
	public static int Sum(int count, int step) {
		//	Get the numbers series.
		int[] series =  ProgressGeomet.Items(count, step);
		
		//	Iterate threw series items and calculate sumation.
		int sumation = 0;
		for(int item : series){
			sumation += item;
		}
		return sumation;
	}
	
	
	public static void main(String[] args) {
		int sum = Sum(5,3);
		System.out.println("Using array "+ 3 +"steps start with " + 5 + " = " + sum);
		return;
	}
}
