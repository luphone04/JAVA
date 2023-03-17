package PrepareForExam.Array;

import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(nums));
        changeArray(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void changeArray(int[] arr){
        arr[0] = 100;
    }
}
