package PrepareForExam.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArr {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> List= new ArrayList<ArrayList<Integer>>();

        //initailize
        for(int i = 0; i < 5; i++){
            List.add(new ArrayList<Integer>());
        }

        //input
        for(int row = 0; row <List.size() ; row++){
            for(int col = 0; col < 5; col++){
                List.get(row).add(in.nextInt());
            }
        }

        System.out.println(List);
    }
}
