package GUI;
import javax.swing.*;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("1137128.png"); //create an image icon


        JLabel label = new JLabel(); //create a label
        label.setText("Cthullu"); //set the text of this label
        label.setIcon(image); //set the image of this label
        label.setHorizontalTextPosition(JLabel.CENTER); //set the horizontal position of the text, LEFT, CENTRE , RIGHT
        label.setVerticalTextPosition(JLabel.TOP); //set the vertical position of the text, TOP, CENTER, BOTTOM
        label.setForeground(new Color(0x00FF00)); //set the foreground of this label
        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); //set the font of this label
        label.setIconTextGap(25); //set the gap between the text and the image
        label.setBackground(Color.black);



        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.add(label); //add label to the frame

    }
}
