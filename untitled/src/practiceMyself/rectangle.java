package practiceMyself;

public class rectangle {
    float width;
    float length;

    public rectangle(){

    } //default constructor

    public rectangle(float length , float width){
        this.length = length;
        this.width = width;
    }

    public void setLength(float length){
        this.length = length;
    }

    public float getLength(){
        return length;
    }

    public void setWidth(float width){
        this.width = width;
    }

    public float getWidth(){
        return width;
    }

    public double getArea(){
        return width * length;
    }

    public double getperimeter(){
        return (width * 2) + (length * 2);
    }

    public String toString(){
        return "Rectangle[length = " + length + ", width = " + width + "]";
    }



}
