package practiceMyself;

public class TestCircle {
    public static void main(String[] args){

        circle c1 = new circle(); //calling from empty constructor
        c1.setColor("black");
        c1.setRadius(2.0);
        System.out.println("C1");
        System.out.println(c1.toString());
        System.out.println("Area: " + c1.getArea());
        System.out.println("---------------------------------");


        circle c2 = new circle(3.5); //constructor with radius //color is default red
        System.out.println("C2");
        System.out.println(c2.toString());
        System.out.println("Area: " + c2.getArea());
        System.out.println("---------------------------------");


        circle c3 = new circle(4,"blue"); //constructor with radius and color
        System.out.println("C3");
        System.out.println(c3.toString());
        System.out.println("Area: " + c3.getArea());
        System.out.println("---------------------------------");


        circle c4 = new circle(c3); //copy constructor
        System.out.println("C4");
        System.out.println(c4.toString());
        System.out.println("Area: " + c4.getArea());
        System.out.println("---------------------------------");



        System.out.println("Testing the copy constructor");
        System.out.println("Changing the value of C1");
        c1.setColor("green");
        c1.setRadius(5.0);
        System.out.println("C1 After changing: " + c1.getColor() + " " + c1.getRadius());
        System.out.println("C4 After changing: " + c4.getColor() + " " + c4.getRadius());




    }
}
