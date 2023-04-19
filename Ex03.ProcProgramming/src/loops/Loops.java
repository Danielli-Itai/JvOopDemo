package loops;

import java.io.IOException;





public class Loops
{	
	//	Geometric progression member calculation using for{...} loop.
	public static int LoopFor(int first, int count, int step) {
		System.out.printf("For Loop from %d till %d:", first, count);
		
		int sumation = 0;
		for(int i=first; i<count; i+= step) {
			System.out.printf(" %d", i);
			sumation += i;
		}
		System.out.printf(". Sumation %d" + System.lineSeparator(), sumation);
		return sumation;
	}

	//	Geometric progression member calculation using while{...} loop.
	public static int LoopWhile(int first, int count, int step) {
		System.out.printf("While Loop from %d till %d:", first, count);
			
		int i=first;
		int sumation = 0;
		while(i<count){
			System.out.printf(" %d", i);
			sumation += step;
			i += 1;
		}
		
		System.out.printf(". Sumation %d" + System.lineSeparator(), sumation);
		return sumation;		
	}
	
	//	Geometric progression member calculation using do{...}while loop.
	public static int LoopDoWhile(int first, int count, int step) {
		System.out.printf("Do...While Loop from %d till %d:", first, count);
		
		int i=first;
		int sumation = 0;
		do{
			System.out.printf(" %d", i);
			sumation += step;
			i += 1;
		}while(i<count);
		
		System.out.printf(". Sumation %d " + System.lineSeparator(), sumation);
		return sumation;
	}
	
	


	private static final int FIRST = 1;
	private static final int COUNT = 9;
	private static final int STEP = 2;
	

	//Prints Hello World!
	public static void main(String[] args) throws IOException
	{	
		String HelloMesage = "Hello World";
		System.out.print(HelloMesage);

		
		Loops.LoopWhile(FIRST, COUNT, STEP);
		Loops.LoopDoWhile(FIRST, COUNT, STEP);
		Loops.LoopFor(FIRST, COUNT, STEP);
		
		return;
	}
}
