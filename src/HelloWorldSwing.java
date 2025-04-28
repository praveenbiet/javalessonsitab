package src;

import javax.swing.*;

public class HelloWorldSwing {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Swing Hello World");

        // Create a label
        JLabel label = new JLabel("Hello, World with Swing!", SwingConstants.CENTER);

        // Add label to frame
        frame.add(label);

        // Set frame size
        frame.setSize(300, 200);

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make frame visible
        frame.setVisible(true);
    }
}
