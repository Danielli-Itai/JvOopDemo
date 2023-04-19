package pckg4_fibonachi_rec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;





public class FibonachiLoop {

	private static int step_count = 0;

	private static int getUserNumber(String message) throws Exception {
        // Printing the read line
        System.out.println(message);

		// Enter data using BufferReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 
        // Reading data using readLine
        int number = Integer.parseInt(reader.readLine());
        return number;
        
 	}

	
	public static int FiboShort(int last) {
		int[] array = new int[3];
		
		for(int index=0; index<=last; index++) {
			step_count ++;
			//	Shift current values.
			array[2-2] = array[2-1]; 
			array[2-1] = array[2-0];
			
			//	To make room for new value.
			array[2-0] = 0;
			if(index <= 1) {
				array[2]=index;
			}else {
				array[2] = array[2-1]+ array[2-2];
			}
		}
		return(array[last]);
	}

	
	public static int FiboLong(int last) {
		int[] array = new int[last+1];
		
		for(int i=0; i<=last; i++) {
			step_count ++;
			
			if(i <= 1) {
				array[i]=i;
			}else {
				array[i] = array[i-1]+ array[i-2];
			}
		}
		return(array[last]);
	}

	
	public static void main(String[] args)
	{
		try {
			int size = FibonachiLoop.getUserNumber("Please enter item index 0...n:");
			
			step_count = 0;
			System.out.printf("The number for long array is = %d\n", FibonachiLoop.FiboLong(size));
			System.out.printf("The number of steps for long array is = %d\n", step_count);

			step_count = 0;
			System.out.printf("The number for short array is = %d\n", FibonachiLoop.FiboLong(size));
			System.out.printf("The number of steps for short array is = %d\n", step_count);

		}catch(Exception e){
			System.out.printf("Wrong input !");
		}
		
	}
}




