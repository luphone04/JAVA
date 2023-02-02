package AbstractInterface.Interface;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestAbstractNInterface {

    public static void main(String[] args) {
        List<Ball> balls = new ArrayList<>(); //the reason we can instantiate even though it is an abstract class is because we are using the interface Comparable
        balls.add(new Football("Nike" , 5));
        balls.add(new Baseball("Spalding" , 7));
        balls.add(new Football("Wilson" , 3));
        balls.add(new Baseball("Adidas" , 4));

        for(Ball ball : balls){
            System.out.println(ball.getBrandName() + " " + ball.getWeight());
        }
        System.out.println("----------");
        System.out.println("After sorting");
        System.out.println("----------");

        Collections.sort(balls);


        for(Ball ball : balls){
            System.out.println(ball.getBrandName() + " " + ball.getWeight());
        }






    }
}
