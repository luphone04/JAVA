package PrepareForExam.YeThuPractice.Prac1;

public class Car {
    private String id;
    private String name;
    private String color;
    private double velocity;
    private double distance;
    protected static double accumulate_distance;

    public Car(String id, String name, String color, double velocity) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.velocity = velocity;
        this.distance = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public static double getAccumulateDistance() {
        return accumulate_distance;
    }

    public void drive(double time) {
        double drivenDistance = velocity * time;
        this.distance += drivenDistance;
        accumulate_distance += drivenDistance;
    }
}


class Main {
    public static void main(String[] args) {
        practiceMyself.Car car1 = new practiceMyself.Car("101", "Car 1", "Blue", 20);
        practiceMyself.Car car2 = new practiceMyself.Car("R9", "Car 2", "#f2f2f2", 35);
        practiceMyself.Car car3 = new practiceMyself.Car("AZ-204", "Car 3", "Lightly Green", 2);

        car1.drive(10);
        System.out.println(car1.getDistance());
        System.out.println(practiceMyself.Car.getAccumulateDistance());

        car2.setColor("Red");
        System.out.println(car2.getColor());

        System.out.println(car1.getName());
        System.out.println(car3.getDistance());
        System.out.println(car3.getVelocity());

        car3.setVelocity(100);
        car3.drive(20);
        car2.drive(60);
        System.out.println(practiceMyself.Car.getAccumulateDistance());

        car1.setName("New Name");
        car3.setId("AZ-303");
        System.out.println(car1.getName());
        System.out.println(car3.getId());
    }
}
