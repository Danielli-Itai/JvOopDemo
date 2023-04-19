package pckg2_sequencs;

import java.util.Scanner;





public class Sequence {
	public static final String SEQ_ARITH = "arithmentic";
	public static final String SEQ_GEOM = "arithmentic";
	
	
	
	
	//	Get the summation of the series.
	public static int SequenceSum(int[] series) {
		//	Iterate threw series items and calculate summation.
		int sumation = 0;
		for(int item : series){
			sumation += item;
		}
		return sumation;
	}
	

	public static void SequencePrint(String title, int[] sequence, int sum) {
		//	Iterate threw series items and calculate summation.
		System.out.print(title);
		
		int index = 0;
		while(index< sequence.length){
			System.out.print("\t" + sequence[index++]);
		}
		System.out.println("\t sum:" + sum);
		return;
	}
}
