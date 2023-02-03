package Inheritance.inherit1;

public class TestCylinder {
    public static void main(String[] args){
        Cylinder cyn1 = new Cylinder();
        System.out.println(cyn1.getHeight());
        cyn1.setHeight(32);
        System.out.println(cyn1.getHeight());
        System.out.printf("%.4f",cyn1.getVolume());
        cyn1.setColor("red");
        cyn1.setRadius(5);
        System.out.println("");
        System.out.println(cyn1.toString());


        System.out.println("-----------------------");




    }
}
