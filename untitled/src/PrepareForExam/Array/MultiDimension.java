package PrepareForExam.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        //    2d arrays define with 2 bracket
        int[][] arr = new int[3][3]; // 3 rows and 3 columns *note number of column is not necessary to specify in 2d array cause it can be varies
        int[][] arr2 = {
                {1,2,3}, //0th index
                {4,5,6}, //2nd index
                {7,8,9} //3rd index
        };
        //input
        for(int row = 0; row < arr.length; row ++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }

//        printing normal
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        //print with toString
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }

    }
}
