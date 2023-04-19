package pckg2_sequencs;

import java.util.Scanner;

public class SeqGeom {
	
	//	Create an array for the series numbers.
	public static int[] Array(int start, int count, int step) {
		int[] result = new int[count];
		
		result[0] = start; 
		for(int i= 1; i<count; i++) {
			result[i] = result[i-1] * step;
		}
		return result;
	}

	
	public static void GeometricCalc() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter sequence start, size, step values:\n");
		int start = input.nextInt();
		int size = input.nextInt();
		int step = input.nextInt();
		input.close();
		
		int[] arith_seq = Array(start, size, step);
		int arith_sum = Sequence.SequenceSum(arith_seq);
		
		Sequence.SequencePrint("Geomertic sequence :", arith_seq, arith_sum);
		return;		
	}
	
	public static void main(String[] args) {
		GeometricCalc();
		return;
	}

}
