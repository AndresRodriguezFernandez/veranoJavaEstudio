package Capitulo8;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploFileChooser extends JFrame {
    private JPanel contentPane;
    private JTextField textField;
    private JTextArea textArea;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    EjemploFileChooser frame = new EjemploFileChooser();
                    frame.setVisible(true);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }

    public EjemploFileChooser(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,450,300);
        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);

        textField = new JTextField();
        textField.setToolTipText("Inserta la ruta del fichero de audio");
        textField.setBounds(52, 26, 209, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        JButton btnSeleccionar = new JButton("Seleccioanr...");
        btnSeleccionar.setBounds(288, 25, 109, 23);
        contentPane.add(btnSeleccionar);

        textArea=new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBounds(52, 76, 360, 156);

        JScrollPane scroll= new JScrollPane(textArea);
        scroll.setBounds(52, 76, 360, 156);
        contentPane.add(scroll);

        btnSeleccionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JFileChooser fc = new JFileChooser();

        int seleccion = fc.showOpenDialog(contentPane);

        if (seleccion == JFileChooser.APPROVE_OPTION){
            File fichero =fc.getSelectedFile();
                try {
                    FileWriter fw = new FileWriter(fichero);
                    fw.write(textArea.getText());
                }catch (IOException e1){
                    e1.printStackTrace();
                }
        }
    }
}
