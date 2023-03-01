package practiceMyself;

class circle{
     double radius;
     String color;


//    public circle(){ //calling from empty constructor
//        this(23); //will choose the other constructor by matching the argument
//    }
    public circle(){ //

    }
    public circle(double radius){ //constructor with radius //this is a constructor
        this.radius = radius; //this is a variable //this.radius is the variable of the class //radius is the variable of the constructor
        color = "red"; //why we don't put "this" here? because we don't have any other variable called color in this constructor so we don't need to use "this" here to distinguish between the two variables
    }

    public circle(double radius , String color){ //default constructor
        this.radius = radius;
        this.color = color;
    }

    circle(circle other){ //copy constructor //this is a constructor //this is a copy constructor
        this.radius = other.radius;
        this.color = other.color;
    }

    public double getRadius(){
        return radius;
    }

    public String getColor(){
        return color;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String toString(){
        return "Circle[radius = " + radius + " color = " + color + "]";
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

}

