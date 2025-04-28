package src;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HelloWorldAWT {
    public static void main(String[] args) {
        // Create a Frame
        Frame frame = new Frame(" Hello It");

        // Create a Label
        Label label = new Label("Hello, World with AWT!", Label.CENTER);

        // Add label to frame
        frame.add(label);

        // Set frame size
        frame.setSize(300, 200);

        // Make frame visible
        frame.setVisible(true);

        // Add a window closing event
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
