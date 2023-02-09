package practiceMyself.Swing;
//import javax.swing.*;
//
//public class SwingExample {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Swing Example");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //this is to close the window
//
//        JLabel label = new JLabel("Hello, Swing!");
//        frame.add(label); //add the label to the frame
//
//        frame.pack(); //this is to resize the frame to fit the label
//        frame.setVisible(true); //this is to show the frame
//    }
//}

import javax.swing.*;
import java.awt.event.*;

public class SwingExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Example 2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //this is to close the window

        JLabel label = new JLabel("Welcome to Swing!");
        JButton button = new JButton("Click Me");

        button.addActionListener(new ActionListener(){ //this is to add an action listener to the button
            public void actionPerformed(ActionEvent e) { //this is to add an action to the button
                label.setText("Button was clicked!"); //this is to change the text of the label
            }
        });

        frame.add(label, "North");
        frame.add(button, "South");

        frame.pack();
        frame.setVisible(true);
    }
}
//100 witch heal
//100 knight
//
//40 witch damage
//50 knight damage
//
//50 witch heal after fght
//60 knight heal after fight