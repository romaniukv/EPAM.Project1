package com.epam.project1.model.entities;

public class Car extends Toy {

    private Colour colour;

    public Car(double price, Size size, Colour colour) {
        super("Car", price, size);
        this.colour = colour;
    }

    public Colour getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return super.toString() + ", Цвет: " + colour;
    }
}
