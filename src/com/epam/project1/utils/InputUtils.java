package com.epam.project1.utils;

import com.epam.project1.view.Viewer;

import java.util.Scanner;

public class InputUtils {

    private static Scanner in = new Scanner(System.in);

    public static int inputInt() {
        int result;
        while (!in.hasNextDouble()) {
            System.out.println(Viewer.INPUT_ERROR);
            in.nextLine();
        }
        result = in.nextInt();
        in.nextLine();
        return result;
    }

    public static double inputPrice(String msg) {
        System.out.println(msg);
        double price;
        while (!in.hasNextDouble()) {
            System.out.println(Viewer.INPUT_ERROR);
            System.out.println(msg);
            in.nextLine();
        }
        price = in.nextDouble();
        in.nextLine();
        return price;
    }
}
