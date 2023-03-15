package PrepareForExam.Encapsulation;

//
//private: Accessible only within the class.
//default (no modifier): Accessible within the same package.
//protected: Accessible within the same package and by subclasses in other packages.
//public: Accessible from any class.



//        + (plus sign) represents public access.
//        - (minus sign) represents private access.
//        # (hash sign) represents protected access.
//        ~ (tilde sign) represents default (package-private) access.
//       When the method is "underlined", notice that it is a static method.
//      When the method is "bold", notice that it is an abstract method.
//      When the method is "italic", notice that it is a final method.
//      When the method is "strikethrough", notice that it is a synchronized method.
//      When the method is "underlined and bold", notice that it is a static and abstract method.
//      When the method is "underlined and italic", notice that it is a static and final method.
//      When the method is "underlined and strikethrough", notice that it is a static and synchronized method.
//      When the method is "bold and italic", notice that it is an abstract and final method.
//      When the method is "bold and strikethrough", notice that it is an abstract and synchronized method.
//      When the method is "italic and strikethrough", notice that it is a final and synchronized method.


public class Employee {
    private String name;
    private int age;
    private double salary;

    // Constructor
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
