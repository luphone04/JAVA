package AbstractInterface.AbstractExample;


public abstract class Shape {

    String color;
    boolean filled;
    java.util.Date dateCreated;

    Shape(){ //

    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    public String toString(){
        return "created on " + dateCreated + " color: " + color + " and filled: " + filled;
    }

    abstract double getArea();

    abstract double getPerimeter();


}
