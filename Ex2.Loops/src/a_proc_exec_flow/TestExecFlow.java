package a_proc_exec_flow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestExecFlow {
	private static final int FIRST = 0;
	private static final int COUNT = 10;
	private static final int STEP = 2;
	

	@Test
	void test_loops() {
		IntroLoops.LoopFor(FIRST,COUNT);
		IntroLoops.LoopWhile(FIRST,COUNT);
		IntroLoops.LoopDoWhile(FIRST,COUNT);
	}

	@Test
	void test_exec_flow() {
		IntroLoopsBranch.BranchIfElse(0, FIRST, COUNT);
		IntroLoopsBranch.BranchIfElse(1, FIRST, COUNT);
		IntroLoopsBranch.BranchIfElse(2, FIRST, COUNT);
	}
}
