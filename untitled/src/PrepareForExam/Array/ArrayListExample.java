package PrepareForExam.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println(list.contains(65));
        list.set(1, 100);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);


        //inputting
        for(int i = 0; i < list.size(); i++){
            list.add(in.nextInt());
        }


        //output
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
