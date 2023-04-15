package int_array;

import java.util.Scanner;

public class IntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Array size \n");
		int D = input.nextInt();
		int[][]a = new int[D][];
		
		if (D > 1) {
		    for (int id = 0; id < D ; id++) {
		    	System.out.println("Enter new number \n");
		    	int DI = input.nextInt();
		    	a[id] = new int[DI];
		    }
		}
		input.close();
		
		return;
	}

}
