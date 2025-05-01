package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventDemo extends JFrame {

    private JButton button;
    private JLabel mouseLabel;
    private JLabel keyLabel;

    public EventDemo() {
        setTitle("Event Handling Demo");
        setSize(400, 300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("Click Me");
        mouseLabel = new JLabel("Mouse Status: ");
        keyLabel = new JLabel("Key Status: ");

        // ActionEvent (Button Click)
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Button was clicked!");
            }
        });

        // MouseEvent using MouseAdapter
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                mouseLabel.setText("Mouse Clicked at: X=" + e.getX() + " Y=" + e.getY());
            }
        });

        // KeyEvent using KeyAdapter
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                JOptionPane.showMessageDialog(null, "key pressed"+e.getKeyChar());

            }
        });

        add(button);
        add(mouseLabel);
        add(keyLabel);

        setFocusable(true);  // Required to receive key events
        setVisible(true);
    }

    public static void main(String[] args) {
        new EventDemo();
    }
}
