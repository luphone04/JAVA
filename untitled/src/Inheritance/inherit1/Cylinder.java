package Inheritance.inherit1;

public class Cylinder extends Circle {
    private double height;
    Cylinder(){super(); height= 1.0;}
    Cylinder(double radius){super(radius) ; this.height = height;}
    Cylinder(double radius , double height, String color){super(radius , color); this.height = height;}
    public double getHeight(){return height;}
    public void setHeight(double height){this.height = height;}
    public double getVolume(){return getArea() * height;}

}
