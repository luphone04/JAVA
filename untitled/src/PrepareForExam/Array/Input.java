package PrepareForExam.Array;

import PrepareForExam.Exam1.AString;

import java.util.Arrays;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 67;
        arr[3] = 89;
        arr[4] = 90;
//        System.out.println(arr[0]);

        //Inputting in array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        //Printing with for loop
//        for (int j : arr) {
//            System.out.print(j + " ");
//        }

        //printing using toString
        System.out.print(Arrays.toString(arr));



        //array of objects
        String[] arr2 = new String[5];
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = in.next();
        }
        System.out.println(Arrays.toString(arr2));

        arr2[2] ="Hello";
        System.out.println(Arrays.toString(arr2));
    }


}
