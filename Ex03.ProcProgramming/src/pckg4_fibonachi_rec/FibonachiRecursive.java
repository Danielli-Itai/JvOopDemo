package pckg4_fibonachi_rec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;





public class FibonachiRecursive {

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

	public static int Fibo(int last) {
		step_count ++;
		if(last<=1) {
			return last;
		}
		return(Fibo(last-1)+Fibo(last-2));
	}

	public static void main(String[] args)
	{
		try {
			int size = FibonachiRecursive.getUserNumber("Please enter item index 0...n:");
			System.out.printf("The number is = %d\n", FibonachiRecursive.Fibo(size));
			System.out.printf("The number of steps is = %d\n", step_count);
		}catch(Exception e){
			System.out.printf("Wrong input !");
		}
		
	}
}




