package pkg_arrays;

import java.util.Scanner;

public class DinamicArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Array dimentions \n");

        int D = input.nextInt();
        int[][]a = new int[D][];
        if (D > 1) {
            for (int id = 0; id < D; id++){
                int DI = input.nextInt();
                a[id] = new int[DI];
            }
        }
        input.close();
    }

}
