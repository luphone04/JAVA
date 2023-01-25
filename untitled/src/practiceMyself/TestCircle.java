package practiceMyself;

public class TestCircle {
    public static void main(String[] args){
        circle c1 = new circle(20, "red");
        System.out.println("The radius is: " + c1.radius);
        System.out.println("The radius is: " + c1.getRadius());
        System.out.println("The coloe is: " + c1.color);
        System.out.println("The area is: " + c1.getArea());
        System.out.println("The circumference is: " + c1.getCircumference());
        System.out.println(c1.toString());


        System.out.println("-----------------------");
        circle c2 = new circle();
        System.out.println("THe radius is: " + c2.radius);
        System.out.println("THe color is: " + c2.color);
        System.out.println("The radius is: " + c2.getRadius());
        //changing color
        c2.color = "blue";
        System.out.println("The color after changing is : " + c2.color);


        System.out.println("-----------------------");

        circle c3 = new circle(c1); //copy constructor
        System.out.println("The radius is: " + c3.radius);
        System.out.println("The color is: " + c3.color);
        System.out.println("The radius is: " + c3.getRadius());
        System.out.println("The area is: " + c3.getArea());
        System.out.println("The circumference is: " + c3.getCircumference());
        System.out.println(c3.toString());
        System.out.println("-----------------------");
        c1.radius = 10;
        System.out.println("The radius is: " + c1.getRadius());
        System.out.println("The radius is: " + c3.getRadius()); //will not change because it is a copy of c1
        System.out.println("The area is: " + c1.getArea());
        System.out.println("The area is: " + c3.getArea());


        System.out.println("-----------------------");
        //empty constructor
        circle c4 = new circle();

        //calling getter and setter
        c4.setRadius(10);
        System.out.println("The radius is: " + c4.getRadius());
        c4.setArea(100);
        System.out.println("The radius is: " + c4.getRadius());
        System.out.println("The area is: " + c4.getArea());
        System.out.println("The circumference is: " + c4.getCircumference());
        System.out.println(c4.toString());




    }
}
