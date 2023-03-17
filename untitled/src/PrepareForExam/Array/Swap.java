package PrepareForExam.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Swap {
    public static void main(String[] args){
        int[] arr = {2,6,7,3,2,54,3,23,4};
//        swap(arr, 0, 4);
//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }
//
//        System.out.println(max(arr));
//        System.out.println(maxRange(arr,4,8));
//
        reverse(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void swap(int[] arr, int a, int b ){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

     static int max(int[] arr) {
         int temp = arr[0];
         for (int i = 0; i < arr.length; i++) {
             if(arr[i] > temp){
                 temp = arr[i];
             }
         }
         return temp;
     }

     static int maxRange(int[] arr, int start, int end){
         int temp = arr[start];
         for (int i = start; i <= end; i++) {
             if(arr[i] > temp){
                 temp = arr[i];
             }
         }
         return temp;

     }

     static void reverse(int[] arr){

        for(int i = 0; i < arr.length; i++){
            for(int n = arr.length - 1; n >= 0; n--){
                swap(arr,i , n);
            }


        }

     }


      }
