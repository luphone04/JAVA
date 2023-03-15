package PrepareForExam.Inheritance;

//default extending
class A {
    public A() {
        System.out.println("Constructor of superclass A");
    }
}

class B extends A {
    public B() {
        // The default constructor of superclass A will be called automatically
        // But you can still call it explicitly using 'super()'
        super();
        System.out.println("Constructor of subclass B");
    }
}

class A1 {
    public static void main(String[] args) {
        B obj = new B();
    }
}


 class A2 {
    public static void main(String[] args) {
        A obj = new B(); // Using the superclass's data type but instantiating with the subclass's constructor
    }
}


//     B obj = new B();
//     This line creates a new instance of the B class and assigns it to a reference variable obj of type B.
//        When using this approach, you can access all the properties and methods specific to the B class, as well
//        as any properties and methods inherited from the superclass (assuming they are accessible based on their
//        visibility).

//        A obj = new B();
//        This line also creates a new instance of the B class, but the reference variable obj is of type A, which
//        is the superclass of B. This is an example of polymorphism, where a reference of the superclass type is
//        used to store an object of the subclass. When using this approach, you can only access the properties and
//        methods defined in the superclass A, even though the actual object is an instance of the subclass B. If
//        you need to access properties or methods specific to the subclass B, you would need to perform a downcast.

//        Using A obj = new B(); enables you to treat objects of different subclasses as if they were objects of the
//        superclass, which can make your code more flexible and reusable. However, you might not have access to
//        subclass-specific properties or methods without downcasting.


//     In summary, the main differences between the two lines of code are:
//
//        B obj = new B(); allows you to access all properties and methods of the B class, including those
//        inherited from A.
//        A obj = new B(); allows you to take advantage of polymorphism, but you can only access properties and
//        methods defined in the superclass A. To access subclass-specific properties or methods, you would need
//        to perform a downcast.

