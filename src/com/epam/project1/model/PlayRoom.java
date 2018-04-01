package com.epam.project1.model;

import com.epam.project1.model.entities.Toy;
import com.epam.project1.utils.DataBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlayRoom {

    private List<Toy> toys;

    public PlayRoom() {
        toys = new ArrayList<>();
    }

    public List<Toy> getToys() {
        return toys;
    }

    public double fillPlayRoom(double price) {
        toys = DataBase.getToysByPrice(price);
        return  calculateTotalPrice();
    }

    public void sortToysByPrice() {
        Collections.sort(toys, new Comparator<Toy>() {
            @Override
            public int compare(Toy toy1, Toy toy2) {
                return Double.compare(toy1.getPrice(), toy2.getPrice());
            }
        });
    }

    public List<Toy> findToysByPrice(double startPrice, double endPrice) {
        List<Toy> result = new ArrayList<>();
        for (Toy toy: toys)
            if (toy.getPrice() >= startPrice && toy.getPrice() <= endPrice)
                result.add(toy);
        return result;
    }

    private double calculateTotalPrice() {
        double totalPrice = 0;
        for (Toy toy: toys) {
            totalPrice += toy.getPrice();
        }
        return totalPrice;
    }

}
