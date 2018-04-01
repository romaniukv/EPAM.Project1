package com.epam.project1.model.entities;

public class Doll extends Toy {

    private String name;

    public Doll(String name, double price, Size size) {
        super("Doll", price, size);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString() + ", Имя: " + name;
    }
}
