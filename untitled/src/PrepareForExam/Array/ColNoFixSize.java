package PrepareForExam.Array;

import java.util.Arrays;

public class ColNoFixSize {
    public static void main(String[] args){
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };
        for(int i = 0; i < arr.length ; i++){
            for(int n = 0; n < arr[i].length; n++){
                System.out.println(arr[i][n] + " ");
            }
            System.out.println();
        }
    }
}
