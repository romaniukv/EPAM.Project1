package com.epam.project1.model.entities;

public abstract class Toy {

    private String typeOfToy;
    private double price;
    private Size size;

    public Toy(String typeOfToy, double price, Size size) {
        this.typeOfToy = typeOfToy;
        this.price = price;
        this.size = size;
    }

    public String getTypeOfToy() {
        return typeOfToy;
    }

    public double getPrice() {
        return price;
    }

    public Size getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Вид игрушки: " + typeOfToy + ", Цена: " + price + ", Размер: " + size;
    }
}
