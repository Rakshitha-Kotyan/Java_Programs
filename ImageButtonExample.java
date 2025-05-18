/*4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour
Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is
pressed by implementing the event handling mechanism with addActionListener( ).*/
// Program Name: ImageButtonExample.java
// Description: Displays a message based on which image button is clicked using addActionListener()

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ImageButtonExample {
    JLabel messageLabel;

    ImageButtonExample() {
        // Create Frame
        JFrame frame = new JFrame("Image Button Example");
        frame.setSize(600, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Label to show output
        messageLabel = new JLabel();
        messageLabel.setBounds(50, 40, 500, 60);
        messageLabel.setFont(new Font("Serif", Font.BOLD, 30));

        // Load images
        ImageIcon digitalIcon = new ImageIcon("digital.png");   // Replace with your image path
        ImageIcon hourglassIcon = new ImageIcon("hourglass.png"); // Replace with your image path

        // Create Buttons with images
        JButton digitalBtn = new JButton(digitalIcon);
        digitalBtn.setBounds(100, 150, 150, 150);
        digitalBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Digital Clock is pressed");
            }
        });

        JButton hourglassBtn = new JButton(hourglassIcon);
        hourglassBtn.setBounds(300, 150, 150, 150);
        hourglassBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Hour Glass is pressed");
            }
        });

        // Add components to frame
        frame.add(digitalBtn);
        frame.add(hourglassBtn);
        frame.add(messageLabel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ImageButtonExample();
    }
}
