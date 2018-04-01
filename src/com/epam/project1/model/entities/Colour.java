package com.epam.project1.model.entities;

public enum  Colour {
    WHITE("Белый"), GREEN("Зелёный"), YELLOW("Жёлтый"), BLUE("Голубой"), BLACK("Чёрный"), PINK("Розовый");

    private String name;

    Colour(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
