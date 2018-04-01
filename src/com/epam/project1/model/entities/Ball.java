package com.epam.project1.model.entities;

public class Ball extends Toy {

    private String type;

    public Ball(double price, Size size, String type) {
        super("Ball", price, size);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString() + ", Тип: " + type;
    }
}
