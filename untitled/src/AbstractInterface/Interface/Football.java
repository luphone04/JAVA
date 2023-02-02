package AbstractInterface.Interface;

public class Football extends Ball implements Tossable {

    public Football(String brandName , int weight){
        super(brandName , weight); // calls the constructor of the parent class Ball and passes the brandName parameter to it
    }


    @Override
    public void toss(){
        System.out.println("The Football is being kicked");
    }

    @Override
    public void bounce(){
        System.out.println("The Football is bouncing");
    }
}
