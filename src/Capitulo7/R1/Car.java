package Capitulo7.R1;

public class Car extends Vehicle{
    int maxSpeed = 180;


    void display(){
        System.out.println("Velocidad máxima: " + super.maxSpeed);
    }
}
