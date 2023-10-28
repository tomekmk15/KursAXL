package com.marek21;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
    public MyFrame() {
        // Set the size, title, and default close operation for the frame.
        setPreferredSize(new Dimension(400, 300));
        setTitle("My Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to hold the frame's content.
        JPanel panel = new JPanel();

        // Add the panel to the frame.
        add(panel);

        // Pack the frame to the preferred size of its components.
        pack();
    }

    public static void main(String[] args) {
        // Create a new frame and make it visible.
        MyFrame frame = new MyFrame();
        frame.setVisible(true);
    }
}
