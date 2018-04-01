package com.epam.project1;

import com.epam.project1.controller.Runner;
import com.epam.project1.model.PlayRoom;
import com.epam.project1.view.Viewer;

public class Test {

    public static void main(String[] args) {
        new Runner(new PlayRoom(), new Viewer()).run();
    }
}