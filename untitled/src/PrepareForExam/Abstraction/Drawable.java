package PrepareForExam.Abstraction;


//An interface is a collection of abstract methods (without implementation) and constants (final variables).
//        It provides a contract that any class implementing the interface must adhere to by providing implementations
//for all the methods declared in the interface.
//
//        A class can implement multiple interfaces, which allows for a form of multiple inheritance in Java.

interface Drawable {
    void draw();
}

class Circle implements Drawable {
    void radius() {
        System.out.println("The radius of the circle is 5");
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Mains {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        myCircle.radius(); // Output: The radius of the circle is 5
        myCircle.draw();   // Output: Drawing a circle
    }
}

