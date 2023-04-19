package loops;


public class LoopsBranch
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

	
	enum LoopType
	{
			FOR
		,	WHILE
		,	DO
	};

	private static final int FIRST = 0;
	private static final int COUNT = 10;
	private static final int STEP = 2;
	


	
	public static void BranchIfElse(int loop_type, int first, int count, int step)
	{
		if(0 == loop_type) {
			LoopFor(first, count, step);
		}
		else if (1 == loop_type) {
			LoopWhile(first, count, step);
		}
		else if(2 == loop_type) {
			LoopDoWhile(first, count, step);
		}
		return;
	}

	public static void BranchSwitchCase(LoopType loop, int first, int count, int step)
	{
		switch(loop)
		{
		case FOR:
			LoopFor(first, count, step);
			break;
			
		case WHILE:
			LoopWhile(first, count, step);
			break;
		case DO:
			LoopDoWhile(first, count, step);
			break;
		}
		return;
	}
	
	
	
	public static void main(String[] args)
	{

		BranchIfElse(0, FIRST, COUNT, STEP);
		BranchIfElse(1, FIRST, COUNT, STEP);
		BranchIfElse(2, FIRST, COUNT, STEP);
		
		BranchSwitchCase(LoopType.FOR, FIRST, COUNT, STEP);
		BranchSwitchCase(LoopType.WHILE, FIRST, COUNT, STEP);
		BranchSwitchCase(LoopType.DO, FIRST, COUNT, STEP);
		return;
	}
}
