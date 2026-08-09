package Capitulo8;

import javax.swing.*;
import java.awt.*;

public class HolaMundoSwing {
    private JLabel label;
    private JPanel panel1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Titulo Ventana Hola Mundo");

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hola Mundo");
        frame.getContentPane().add(label);

        frame.pack();

        frame.setLocationRelativeTo(null);
        label.setHorizontalAlignment(0);
        label.setForeground(Color.orange);
        frame.setVisible(true);

    }
}
