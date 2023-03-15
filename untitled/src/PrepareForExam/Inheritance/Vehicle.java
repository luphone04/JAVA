package PrepareForExam.Inheritance;

//Usage of Final and Protected
class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public final void honk() { // This method cannot be overridden due to the 'final' keyword
        System.out.println("The vehicle honks");
    }
}

final class Car extends Vehicle { // This class cannot be extended due to the 'final' keyword
    private String model;

    public Car(String brand, String model) {
        super(brand); // Call the superclass's constructor
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model);
        honk(); // Call the superclass's honk() method
    }
}

// This class will cause a compilation error since the Car class is final and cannot be extended
// class SportsCar extends Car {
//     // ...
// }



class Vehicles {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry");
        myCar.displayInfo(); // Output: Brand: Toyota, Model: Camry
        myCar.honk(); // Output: The vehicle honks
    }

}

