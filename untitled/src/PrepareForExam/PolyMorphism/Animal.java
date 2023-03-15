package PrepareForExam.PolyMorphism;

//PolyMorphism is all about method overridding and method overloading
//To recognize polymorphism in UML diagrams, pay attention to the relationships between classes, such as inheritance
//        and realization, and look for overridden or extended methods in subclasses or implementing classes.

// Base class
class Animals {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// Subclass
class Dog extends Animals {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

// Subclass
class Cat extends Animals {
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}

public class Animal {
    public static void main(String[] args) {
        Animals myAnimal = new Animals();
        Animals myDog = new Dog(); // create an instance of the Dog class //datatype Animals
        Animals myCat = new Cat(); // create an instance of the Cat class //datatype Animals

        myAnimal.makeSound(); // Output: The animal makes a sound
        myDog.makeSound(); // Output: The dog barks
        myCat.makeSound(); // Output: The cat meows

        if(myAnimal instanceof Dog){ //Animals extend Dog (False)
            System.out.println("My animal is a dog");
        }else{
            System.out.println("My animal is not a dog");
        }

        if(myDog instanceof Animals){ //Dog extend Animals
            System.out.println("My dog is animal");
        }else{
            System.out.println("My dog is not animal");
        }



//        Upcasting (casting from a subclass as constructor to a superclass as datatype) is always safe and doesn't require an explicit cast.
//        Downcasting (casting from a superclass to a subclass) can be unsafe and requires an explicit cast.
//        The point of downcasting is to access subclass-specific methods or properties that are not available in the superclass when you have a reference to a superclass object that is actually an instance of a subclass.

        if (myDog instanceof Dog) { //condition true
            Dog myDog2 = (Dog) myDog; // Downcasting (explicit cast required) basically changing datatype of subclass to superclass datatype
            myDog2.makeSound(); // Output: The dog barks
        }else {
            System.out.println("My Dog is no dawg");
        }


        if(myAnimal instanceof Dog){ //condition false
            Dog myDog3 = (Dog)myAnimal; //cannot downcast because "Datatype "Animal" object "myAnimal" is not instance of "Dog" class."
            myDog3.makeSound();
        }else{
            System.out.println("My Animal is not dog.");
        }
    }
}

