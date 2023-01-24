package com.kunal.introduction;

public class Wrapperexample {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
//        Integer num = new Integer(45); // this is a wrapper class
        Integer num = 45; // autoboxing // Integer is a class
        //num has become object
        //converitng character to object

        swap(a,b);
        System.out.println(a + " " + b);

        A kunal = new A("Jessica");
        kunal.name = "other name";

        //When a non primitive is final. you cannot reassign it.
//        kunal = new A("New object");


        A obj;

        for(int i = 0 ; i < 1000000000; i++){
            obj = new A("Random Name"); // create new object 10000000times // this is a waste of memory // this is a waste of time

        }

    }

    //When use pass obj,  the reference value is passed
    static void swap(Integer a , Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }


}

class A{
    final int num = 10;
    String name;

    public A(String name) {
        System.out.println("Object created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable { //When any object from Class A is free or destroyed, this method is called
        System.out.println("Object is destroyed");
    }
}
