package PrepareForExam.Array;
//
//Array: An array has a fixed size, which means you must define its size when you create it. Once an array is created,
//        you cannot change its size. If you need to add or remove elements, you must create a new array and copy the
//        elements over.
//
//        ArrayList: An ArrayList is a dynamic data structure, which means its size can change as you add or remove
//        elements. It automatically resizes itself when you perform these operations, making it more flexible and
//        easier to work with when you need a resizable collection.


public class Main {
    public static void main(String[] args){
        //datatype[] varaibles_name = new datatype[size]
        int[] rnos = new int[5];
        int[] rnos2 = {1,2,3,4,5};

        int[] ros; //declaring varaibles
        ros = new int[5]; //objecdt is created in memory

        System.out.println(rnos[2]);

        String[] arr = new String[4];
        System.out.println(arr[0]); //null





    }
}
