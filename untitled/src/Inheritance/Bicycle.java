package Inheritance;


//To share similar properties and similar attributes
//There would be many kind of similarity across all of those types of CLASSES but there will also be many kinds of difference (common behavior and different behavior )
//Remember the phrase “is a type of …. ”
//The child type class will be inheriting the properties from base parent class
//The child class is expanding from the parent class. And also those children can expand all the other children under them
//Initialize the base class constructor by calling the super method in the child class constructor
//Example super(startSpeed , startGear);

class Bicycle {
    protected int gear;
    protected int speed;

    public Bicycle(int startSpeed, int startGear){
        gear = startGear;
        speed = startSpeed;
    }
    public void setGear(int newValue){
        gear = newValue;
    }
    public void applyBrake(int decrement){
        speed -= decrement;
    }

    public void speedUp(int increment){
        speed += increment;
    }
}
