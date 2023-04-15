package arrays_pckg;

import java.util.Random;

public class RandArray
{	
	//	Geometric progression member calculation using for{...} loop.
	public static int[] ArrayRand(int size, int upper_ound) 
	{
	    Random rand = new Random();
	    
	    int[] result = new int[size];
		for(int i=0; i<size; i++) {
			result[i] = rand.nextInt(upper_ound);
		}
		return result;
	}

	//	Get the summation of the series.
	public static int ArraySum(int[] arr)
	{
		//	Iterate threw series items and calculate sumation.
		int sumation = 0;
		for(int item : arr){
			sumation += item;
		}
		return sumation;
	}

	public static void main(String args[])
	{
		int [] arr = ArrayRand(5,100);
		int sum = ArraySum(arr);
		System.out.println("The sum of 1 to 1000 is:" + sum);
	}
	
}
