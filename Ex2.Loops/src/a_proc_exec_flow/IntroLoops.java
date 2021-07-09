package a_proc_exec_flow;

import java.io.IOException;





public class IntroLoops {

	//	Geometric progression member calculation using for{...} loop.
	public static int LoopFor(int first, int count) {
		System.out.printf("For Loop from %d till %d:", first, count);
		
		int sumation = 0;
		
		//// Enter your code here !
		////

		System.out.printf(". Sumation %d" + System.lineSeparator(), sumation);
		return sumation;
	}

	//	Geometric progression member calculation using while{...} loop.
	public static int LoopWhile(int first, int count) {
		System.out.printf("While Loop from %d till %d:", first, count);
			
		int sumation = 0;

		//// Enter your code here !
		////
		
		System.out.printf(". Sumation %d" + System.lineSeparator(), sumation);
		return sumation;		
	}
	
	//	Geometric progression member calculation using do{...}while loop.
	public static int LoopDoWhile(int first, int count) {
		System.out.printf("Do...While Loop from %d till %d:", first, count);

		int sumation = 0;
		//// Enter your code here !
		////
		
		System.out.printf(". Sumation %d " + System.lineSeparator(), sumation);
		return sumation;
	}
	
}
