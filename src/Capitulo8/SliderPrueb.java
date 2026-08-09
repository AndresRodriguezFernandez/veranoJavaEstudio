package Capitulo8;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SliderPrueb {
    private JSlider slider1;
    private JPanel panel1;
    private JTextField textLeido;
    private JLabel label1;

    public SliderPrueb(){
        slider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                label1.setText(String.valueOf(slider1.getValue()));
                textLeido.setText(String.valueOf(slider1.getValue()));
            }
        });

        textLeido.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                slider1.setValue(Integer.parseInt(textLeido.getText()));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SliderPrueba");
        frame.setContentPane(new SliderPrueb().panel1);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
}
