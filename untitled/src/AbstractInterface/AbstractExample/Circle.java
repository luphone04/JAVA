package AbstractInterface.AbstractExample;

public class Circle extends Shape{
    double radius;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    double getArea() { //override the abstract method
        return 3.14 * radius * radius;
    }

    @Override
    double getPerimeter() { //override the abstract method
        return 2 * 3.14 * radius;
    }

    double getDiameter(){ //non-abstract method
        return 2 * radius;
    }





}
