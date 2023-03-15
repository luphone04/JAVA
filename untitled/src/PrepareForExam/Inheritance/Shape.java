package PrepareForExam.Inheritance;

// Base class (superclass)


// You can define common attributes and methods in a base class and then extend it to create specialized subclasses,
// without having to rewrite the common code.


//Super
//Call the superclass's constructor from a subclass's constructor (as shown in previous examples).
// Access overridden methods in the superclass.
//Access superclass's members (attributes or methods) when they are hidden by members with the same name in the subclass.




// final keyword with inheritance:
//
//The final keyword can be used to prevent a class from being extended or a method from being overridden:
//A final class cannot be extended by any other class.
//A final method in a superclass cannot be overridden by any subclass.


//1. Constructors and inheritance:
//        When creating an instance of a subclass, the constructor of the superclass is called before the constructor of
//        the subclass. If the superclass does not have a default constructor (no-argument constructor),

//5. protected access modifier:
//        The protected access modifier allows a class member (attribute or method) to be accessible within the same
//package and by subclasses in other packages. This is useful when you want to provide access to class members for
//        subclasses but not for other classes outside the package.



class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public double getArea() {
        return 0;
    }

    public String getColor() {
        return color;
    }
}

// Subclass (derived class)
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color); // Call the constructor of the superclass (Shape)
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

// Subclass (derived class)
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color); // Call the constructor of the superclass (Shape)
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

}

class Shapes{
    public static void main(String[] args){
        Shape myRectangle = new Rectangle("red", 10, 5);
        Shape myCircle = new Circle("blue", 7);

        System.out.println("Rectangle area: " + myRectangle.getArea()); // Output: Rectangle area: 50.0
        System.out.println("Circle area: " + myCircle.getArea()); // Output: Circle area: 153.93804002589985

    }



}


