package Capitulo5.R4;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat dc = new DecimalFormat("####.###");
        Temperatura t = new Temperatura();

        System.out.println(dc.format(t.celsiusToFahrenheit(20)));
        System.out.println(dc.format(t.fahrenheitToCelsius(451)));
    }
}
