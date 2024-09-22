//Exercise 5

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ColorChangePanel extends JFrame {

    public ColorChangePanel() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);

        
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                panel.setBackground(Color.GREEN); 
            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel.setBackground(Color.LIGHT_GRAY);
            }
        });

        
        add(panel);
        setTitle("Mouse Hover Background Color Change");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ColorChangePanel::new);
    }
}
