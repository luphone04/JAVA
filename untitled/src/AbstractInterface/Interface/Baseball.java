package AbstractInterface.Interface;

public class Baseball extends Ball implements Tossable {


    public Baseball(String brandName , int weight){
        super(brandName , weight); // calls the constructor of the parent class Ball and passes the brandName parameter to it

    }


    @Override
    public void toss(){
        System.out.println("The Baseball is being hit");
    }

    @Override
    public void bounce(){
        System.out.println("The Baseball is bouncing");

    }
}
