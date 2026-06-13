package Capitulo2;

import javax.swing.*;

public class R2 {
    public static void main(String[] args) {
        int n1,n2;
        String n1s = JOptionPane.showInputDialog("Introduce el primer número: ");
        n1 = Integer.parseInt(n1s);
        String n2s = JOptionPane.showInputDialog("Introduce el segundo número: ");
        n2 = Integer.parseInt(n2s);
        if (n1/n2 == 0) {
            JOptionPane.showMessageDialog(null, "Los numeros son multiplos");
        }else {
            JOptionPane.showMessageDialog(null, "Los numeros NO son multiplos.");
        }
    }
}
