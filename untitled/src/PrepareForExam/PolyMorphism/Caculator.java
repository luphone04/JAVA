package PrepareForExam.PolyMorphism;


//Compile-time (static) polymorphism:
//        This type of polymorphism is achieved using method overloading. Method overloading allows you to define
//        multiple methods with the same name but different parameter lists in the same class. The correct method to
//        call is determined at compile-time based on the arguments provided.
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class Caculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 3)); // Output: 8
        System.out.println(calculator.add(5.5, 3.3)); // Output: 8.8
    }
}