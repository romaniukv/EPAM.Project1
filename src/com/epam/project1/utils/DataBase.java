package com.epam.project1.utils;

import com.epam.project1.model.entities.*;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private static List<Toy> toys;

    static {
        toys = new ArrayList<>();
        toys.add(new Ball(13.4, Size.SMALL,"Баскетбольный"));
        toys.add(new Car(12, Size.MEDIUM, Colour.BLUE));
        toys.add(new Doll("Даша", 14.5, Size.SMALL));
        toys.add(new ToyCube(15, Size.SMALL));
        toys.add(new Ball(11, Size.MEDIUM,"Футбольный"));
        toys.add(new Car(15, Size.SMALL, Colour.BLACK));
        toys.add(new Doll("Маша", 15.1, Size.SMALL));
        toys.add(new ToyCube(14.8, Size.LARGE));
        toys.add(new Ball(14.4, Size.LARGE,"Волейбольный"));
        toys.add(new Car(14.6, Size.LARGE, Colour.GREEN));
        toys.add(new Doll("Катя", 12.8, Size.SMALL));
        toys.add(new ToyCube(10, Size.SMALL));
        toys.add(new Ball(15.8, Size.SMALL,"Баскетбольный"));
        toys.add(new Car(12.3, Size.MEDIUM, Colour.WHITE));
        toys.add(new Doll("Варвара", 13, Size.SMALL));
        toys.add(new ToyCube(9.8, Size.MEDIUM));
        toys.add(new Ball(11.4, Size.LARGE,"Футбольный"));
        toys.add(new Car(10, Size.SMALL, Colour.YELLOW));
        toys.add(new Doll("Даша", 10, Size.SMALL));
        toys.add(new ToyCube(16.4, Size.LARGE));
        toys.add(new Ball(16, Size.MEDIUM,"Волейбольный"));
        toys.add(new Car(8.4, Size.SMALL, Colour.PINK));
        toys.add(new Doll("Наташа", 9.9, Size.SMALL));
    }

    public static List<Toy> getToysByPrice(double price) {
        double currentPrice = 0;
        List<Toy> result = new ArrayList<>();
        while (currentPrice < price) {
            Toy toy = toys.get((int) (Math.random() * toys.size()));
            if (currentPrice + toy.getPrice() > price)
                break;
            currentPrice += toy.getPrice();
            result.add(toy);

        }
        return result;
    }
}
