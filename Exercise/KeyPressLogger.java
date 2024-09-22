//Exercise 4

import javax.swing.*;
import java.awt.event.*;

public class KeyPressLogger extends JFrame {

    private final JTextField textField;

    public KeyPressLogger() {
        setTitle("Key Press Logger");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField();
        add(textField);
    }

    public void initialize() {
        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("Key Typed: " + e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Key Pressed: " + e.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("Key Released: " + e.getKeyChar());
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            KeyPressLogger frame = new KeyPressLogger();
            frame.initialize();
            frame.setVisible(true);
        });
    }
}
