package AbstractInterface.Interface2;

public class Rectangle extends GeometricObject implements Comparable<Rectangle> {
    private double width;

    private String name;
    private double height;

    public Rectangle() {
    }

    public Rectangle(String name , double width, double height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    /**
     * Return width
     */

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public double getWidth() {
        return width;
    }

    /**
     * Set a new width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Set a new height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    public double getPerimeter(){
        return 2 * (width + height);
    }

    public int compareTo(Rectangle o) {
        if (getPerimeter() > o.getPerimeter())
            return 1;
        else if (getPerimeter() < o.getPerimeter())
            return -1;
        else
            return 0;
    }
}
