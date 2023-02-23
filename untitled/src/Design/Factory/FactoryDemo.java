package Design.Factory;

public class FactoryDemo {

        public static void main(String[] args) {

            ShapeFactory shapeFactory = new ShapeFactory();

            Shape shape1 = shapeFactory.getShape("s");
            shape1.setName("Square");
            shape1.draw();

            Shape shape2 = shapeFactory.getShape("r");
            shape2.setName("Rectangle");
            shape2.draw();

            Shape shape3 = shapeFactory.getShape("c");
            shape3.setName("Circle");
            shape3.draw();


        }

}
