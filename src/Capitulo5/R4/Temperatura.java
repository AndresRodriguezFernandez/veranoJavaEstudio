package Capitulo5.R4;

public class Temperatura {

    public double celsiusToFahrenheit(double temp) {
        return (1.8*temp) + 32;
    }

    public double fahrenheitToCelsius(double temp) {
        return (temp-32)/1.8;
    }
}
