package pckg2_sequencs;

import java.util.Scanner;



public class SeqArith {
	//	Create an array for the series numbers.
	public static int[] Array(int start, int count, int step) {
		int member = start;
		int[] result = new int[count];
		
		for(int i=0; i<count; i++) {
			result[i] = member;
			member += step;
		}
		return result;
	}

	
	public static void SequenceCalc() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter sequence start, size, step values:\n");
		int start = input.nextInt();
		int size = input.nextInt();
		int step = input.nextInt();
		input.close();
		
		int[] arith_seq = Array(start, size, step);
		int arith_sum = Sequence.SequenceSum(arith_seq);
		
		Sequence.SequencePrint("Arithmetic sequence :", arith_seq, arith_sum);
		return;		
	}
	
	public static void main(String[] args) {
		SequenceCalc();
		return;
	}

}
