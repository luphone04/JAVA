package PrepareForExam.Aggregation;

class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

class Car {
    private String brand;
    private Engine engine;

    public Car(String brand, Engine engine) {
        this.brand = brand;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}

class AggregationExample {
    public static void main(String[] args) {
        Engine carEngine = new Engine("V8");
        Car car = new Car("Ford", carEngine);

        System.out.println("The car's brand is: " + car.getBrand());
        System.out.println("The car has a " + car.getEngine().getType() + " engine.");
    }
}
