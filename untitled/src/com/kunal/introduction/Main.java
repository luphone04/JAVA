package com.kunal.introduction;



public class Main {
    public static void main(String[] args){
//        //store 5 roll nos
//        int[] numbers = new int[5];
//
//        //store 5 names
//        String[] names = new String [5];
//
//        //data of 5 students: {roll no , name ,  marks}
//        int[] row = new int[5];
//        String[] name = new String[5];
//        float[] marks = new float[5];

//        Student[] students = new Student[5];

        Student kunal = new Student( 1 , "Shit" , 99.9f);
        Student rahul = new Student();
//        kunal.rno = 1;
//        kunal.name = "Kunal";
//        kunal.marks = 90.0f;
//        kunal.changeName("Kunal");
//        kunal.greeting();
        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

        Student random = new Student(kunal); // this other variable will be replace will kunal
        System.out.println(random.name);

        Student random2 = new Student(); // this other variable will be replace will kunal // this is default constructor
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;
        one.name = "Something Something";
        System.out.println(two.name);

    }
}
class Student{
    int rno;
    String name;
    float marks;
    //We need one word to access every object
    void greeting(){
        System.out.println("Hello" + name);
    }
    void changeName(String newName){
        name = newName;
    }

    //constructor
    //All type of constructor
    //1. Default constructor
    //2. Parameterized constructor
    //3. Copy constructor
    //4. Constructor overloading
    //5. Constructor chaining
    //6. Constructor with this keyword
    //7. Constructor with super keyword
    //8. Constructor with return type
    //9. Constructor with static keyword
    //10. Constructor with final keyword
    //11. Constructor with abstract keyword
    //12. Constructor with synchronized keyword
    //13. Constructor with volatile keyword
    //14. Constructor with transient keyword
    //15. Constructor with native keyword
    //16. Constructor with strictfp keyword
    //17. Constructor with interface keyword
    //18. Constructor with package keyword
    //19. Constructor with protected keyword
    //20. Constructor with private keyword
    //21. Constructor with public keyword
    //22. Constructor with extends keyword
    //23. Constructor with implements keyword
    //24. Constructor with throws keyword





    Student (Student other){ //copy constructor (copying the values of one object to another)
        name = other.name; //basically random.name = kunal.name
        this.rno = other.rno; // random.rno = kunal.rno
        this.marks = other.marks; // random.marks = kunal.marks
    }
    Student(){ //empty constructor
        //this is how you call a constructor from another constructor
        //this keyword is used to call a constructor from another constructor
        //calling from parameterized constructor
        //internally calling the parameterized constructor : newStudent()
        this(13 , "Jessica" , 100f);
    }
    Student(int roll, String name, float marks) { //parameterized constructor
        this.rno = roll;
        this.name = name;
        this.marks = marks;
    }
}
