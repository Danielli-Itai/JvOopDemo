package pkg_arrays;

import java.util.Scanner;

public class IntArray {
    private static int[] getArray()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Array dimension \n");

        int dim = input.nextInt();
        if(dim <= 0){   //  Illegal input.
            return null;
        }

        int[] a = new int[dim];
        for(int i =0; i< dim; i++){
            int num = input.nextInt();
            a[i] = num;
        }
        input.close();
        return a;
    }
    public static void main(String[] args){
        int[] array = IntArray.getArray();

        if(null!=array) {
            for (int i = 0; i < array.length; i++) {
                array[i] *= 10;
            }
            //System.out.println("Aray:" + array.toString());

            for(int val:array){
                System.out.println("Value :" + val);
            }

        }
        return;
    }
}
