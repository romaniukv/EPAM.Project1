package com.epam.project1.model.entities;

public enum Size {
    SMALL("Маленький"), MEDIUM("Средний"), LARGE("Большой");

    private String size;

    Size(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return size;
    }
}
