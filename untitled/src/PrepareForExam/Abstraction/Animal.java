package PrepareForExam.Abstraction;
//
//
//An abstract method is a method that has no implementation in the abstract class. It is declared using the abstract
//keyword and has a semicolon ; instead of a method body. Any concrete (non-abstract) subclass that extends the
//abstract class must provide an implementation for all abstract methods.

abstract class Animal {
    // Abstract method (no implementation)
    abstract void makeSound();

    // Non-abstract method (with implementation)
    void sleep() {
        System.out.println("The animal is sleeping");
    }
}

class Dog extends Animal {
    // Provide implementation for the abstract method
    void makeSound() {
        System.out.println("The dog barks");
    }
}

class Main {
    public static void main(String[] args) {
        // Animal myAnimal = new Animal(); // Cannot create an instance of an abstract class

        Dog myDog = new Dog();
        myDog.makeSound(); // Output: The dog barks
        myDog.sleep();     // Output: The animal is sleeping
    }
}

