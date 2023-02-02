package AbstractInterface.Interface2;

import java.util.ArrayList;
import java.util.Collections;

public class SortRectangleObject {
    public static void main(String[] mains){
        ArrayList<Rectangle> rec = new ArrayList<>();
        rec.add(new Rectangle( "rec1" , 2 , 3));
        rec.add(new Rectangle( "rec2" , 3,5));
        rec.add(new Rectangle("rec3",4,6));
        rec.add(new Rectangle("rec4",1,2));
        rec.add(new Rectangle("rec5",5,7));

        for(Rectangle recs: rec){
            System.out.println(recs.getName() + ":" + recs.getPerimeter());
        }

        System.out.println("----------");
        System.out.println("After sorted");
        Collections.sort(rec);
        System.out.println("----------");

        for(Rectangle recs: rec){
            System.out.println(recs.getName() + ":" +recs.getPerimeter());
        }

    }
}
