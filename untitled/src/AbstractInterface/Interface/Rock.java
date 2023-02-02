package AbstractInterface.Interface;

public class Rock implements Tossable{
    //way to write the code without the constructor
    // public Rock(String brandName){
    //     super(brandName);
    // }
    // public Rock(){
    //     super("Generic Rock");
    // }

    @Override
    public void toss(){
        System.out.println("The rock is being thrown");
    }

}
