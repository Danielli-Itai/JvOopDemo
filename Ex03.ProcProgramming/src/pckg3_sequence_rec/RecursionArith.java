package pckg3_sequence_rec;

import java.util.Scanner;





public class RecursionArith {
	
	private static int depth = 0;
	//	Progression step.
	private static int ArithStep(int value, int count, int step) {
		depth++;
		if(count>0) {
			System.out.printf("\tStack %d \t Item:%d\n", depth, value);
			return value + ArithStep(value+ step, count-1, step);
		}
		depth--;
		return 0;
	}

	
	// Arithmetic Sum.
	public static int ArithSum(int first, int count, int step) {
		System.out.printf("Arithmetic sequence of size %d from %d step %d: \n", count, first, step);
		
		int sum = ArithStep(first, count, step);
		System.out.printf("Sumation %d" + System.lineSeparator(), sum);
		
		return sum;
	}

	
	//	Main Function.
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter sequence start, size, step values:\n");
		int start = input.nextInt();
		int size = input.nextInt();
		int step = input.nextInt();
		input.close();

		
		RecursionArith.ArithSum(start, size, step);
		return;
	}
}

