package practiceMyself;

import practiceMyself.rectangle;

public class testrectangle {

    public static void main(String[] args){
        rectangle rec1 = new rectangle();
        rec1.setLength(8.1f);
        rec1.setWidth(9.2f);
        System.out.println(rec1.toString());
        System.out.println(String.format("%.2f",rec1.getArea()));
        System.out.println(String.format("%.2f",rec1.getperimeter()));
        System.out.println("----------------------");

        rectangle rec2 = new rectangle(3.2f , 7.2f);
        System.out.println(rec2.toString());
        System.out.println(String.format("%.2f",rec2.getArea()));
        System.out.println(String.format("%.2f",rec2.getperimeter()));
        System.out.println("----------------------");



    }


}
