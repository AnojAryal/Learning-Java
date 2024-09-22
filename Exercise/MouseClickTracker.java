//Exercise 2

import java.awt.event.*;
import javax.swing.*;

public class MouseClickTracker extends JFrame {

    public MouseClickTracker() {
        setTitle("Mouse Click Tracker");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void initialize() {
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                System.out.println("Mouse clicked at: (" + x + ", " + y + ")");
            }

            @Override public void mousePressed(MouseEvent e) {}
            @Override public void mouseReleased(MouseEvent e) {}
            @Override public void mouseEntered(MouseEvent e) {}
            @Override public void mouseExited(MouseEvent e) {}
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MouseClickTracker frame = new MouseClickTracker();
            frame.initialize(); 
            frame.setVisible(true);
        });
    }
}
