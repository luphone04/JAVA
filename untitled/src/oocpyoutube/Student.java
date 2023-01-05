package oocpyoutube;

//Class is a blueprint of an object
public class Student {
    String name; // instance variable or field or attribute or property or data member
    int age; // instance variable or field or attribute or property or data member
    String address; // instance variable or field or attribute or property or data member

    // constructor - a special method that is called when an object is created
    // constructor has the same name as the class
    // constructor has no return type
    // constructor is used to initialize the instance variables
    // Use "public" to make the constructor accessible from outside the class
    //Constructor is created to initialize the instance variables of the class when an object is created from the class blueprint (class template)
    public Student(String name, int age, String address) {
        this.name = name; // this.name refers to the instance variable and name refers to the parameter name
        this.age = age;
        this.address = address;
    }

    //Setter Method or Mutator Method
    public void setName(String name){ // void means no return value. It's just suppose to set the value of name
        this.name = name; // this.name refers to the instance variable name. this. mean current object.
    }

    public void setAge(int age){
        this.age = age;
    }

     public void setAddress(String address){
        this.address = address;
     }

     //Getter Method or Accessor Method
     public String getName(){ // String means it will return a String value, Read and return the value of name
        return name;
     }

     public int getAge(){
        return age;
     }

     public String getAddress(){
        return address;
     }

     @Override
    public String toString(){
        return("Student name is " + this.getName() + ", age is: " + this.getAge() + " and address is: " + this.getAddress());
     }

     public static void main(String[] args){

        // new is a keyword that creates an objectq and is a keyboard which you can use to initialize anything in java
        // new called the constructor
        Student john = new Student("John" , 25 , "23 East, California");
        System.out.println(john.toString());
     }

}
