package AbstractInterface.AbstractExample;

public class Test {
    public static void main(String[] args) {
        Circle shape = new Circle();  // Upcast Circle to Shape
        shape.setRadius(5.5);
        System.out.println(shape.getArea());// 94.985
        System.out.println(shape.getPerimeter());//invoke the abstract method
        System.out.println(shape.getRadius());// 5.5





    }
}
