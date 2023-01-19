package class07th_polymorphism;

public class PolymorphismDemo1 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Create a Animal object
        Animal myPig = new Pig("Fly"); // Create a Pig object
        Animal myDog = new Dog(); // Create a Dog object
        Table1  table1 = new Table1();
        makeSound(myAnimal);
        makeSound(myPig);
        makeSound(myDog);
        makeSound(table1);
    }
    public static void makeSound(Object o){
        if(o instanceof Animal){
            ((Animal)o).animalSound();
        }else{
            System.out.println(o + "Not an animal");
        }
    }
}

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public Pig(String action) {
        System.out.println("Pig is going to " + action);
    }
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class Table1 extends Animal {
    public void animalSound() {
        System.out.println("The table says: table table");
    }
}



