package practiceMyself;

public class lll {
    public static void main(String[] args){
    }
}
class circle{
     double radius;
     String color;
    public circle(double radius , String color){ //default constructor
        this.radius = radius;
        this.color = color;
    }

    public circle(){

    }

    public circle(double radius){ //constructor with radius
        this.radius = radius;
        color = "red";
    }

    circle(circle other){
        radius = other.radius;
        color = other.color;
    }


    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setArea(double area){
        this.radius = Math.sqrt(area / Math.PI);     // this is the formula for area of a circle // this.radius is the radius of the circle
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
    public String toString(){
        return "Circle[radius=" + radius + "color=" + color + "]";
    }
}



