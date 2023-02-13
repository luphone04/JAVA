package GUI;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){ //constructor
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set the default close operation
        this.setResizable(false); //prevent the frame from being resized
        this.setSize(500, 500); //set the size of the frame
        this.setVisible(true); //make the frame visible
        this.setTitle("Creating Title"); //set the title of the frame

        ImageIcon image = new ImageIcon("logo-social.png"); //create an image icon
        this.setIconImage(image.getImage()); //change icon of frame
        this.getContentPane().setBackground(new Color(123, 50, 250)); //change background color

    }
}
