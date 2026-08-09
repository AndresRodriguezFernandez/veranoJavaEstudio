package Capitulo8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaSwing {
    private JPanel panel1;
    private JLabel label1;
    private JButton btnlimpia;
    private JButton btnescribe;

    public PruebaSwing(){
        btnescribe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Ha pulsado el botón escribe.");
                label1.setText("Hola Mundo");
            }
        });
        btnlimpia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Ha pulsado el botón limpia");
                label1.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Eercicio de ejemplo");
        frame.setContentPane(new PruebaSwing().panel1);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
