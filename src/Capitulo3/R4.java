package Capitulo3;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.regex.Pattern;

public class R4 {
    public static void main(String[] args) {
        String expresionRegular = "\\d{8}[A-HJ-NP-TV-Z]";

        System.out.println(Pattern.matches(expresionRegular, "12345678S"));
        System.out.println(Pattern.matches(expresionRegular, "87654321A"));
        System.out.println(Pattern.matches(expresionRegular, "87654321U")); //La U no está permitida en los DNI españoles.
        System.out.println(Pattern.matches(expresionRegular, "8765432A"));
    }
}
