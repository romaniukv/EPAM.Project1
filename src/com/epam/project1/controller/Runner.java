package com.epam.project1.controller;

import com.epam.project1.model.PlayRoom;
import com.epam.project1.utils.InputUtils;
import com.epam.project1.view.Viewer;

public class Runner {

    private PlayRoom playRoom;
    private Viewer viewer;

    public Runner(PlayRoom playRoom, Viewer viewer) {
        this.playRoom = playRoom;
        this.viewer = viewer;
    }

    public void run() {
        int key = 0;
        while (key != 5) {
            System.out.println(Viewer.MENU);
            key = InputUtils.inputInt();
            switch (key) {
                case 1:
                    double totalPrice = playRoom.fillPlayRoom(InputUtils.inputPrice(Viewer.INPUT_GENERAL_PRICE));
                    System.out.println(Viewer.TOTAL_PRICE);
                    System.out.printf("%5.2f\n", totalPrice);
                    break;
                case 2:
                    viewer.showToysList(playRoom.getToys());
                    break;
                case 3:
                    playRoom.sortToysByPrice();
                    viewer.showToysList(playRoom.getToys());
                    break;
                case 4:
                    double startPrice = InputUtils.inputPrice(Viewer.INPUT_START_PRICE);
                    double endPrice = InputUtils.inputPrice(Viewer.INPUT_END_PRICE);
                    viewer.showToysList(playRoom.findToysByPrice(startPrice, endPrice));
                    break;
                case 5:
                    break;
                default:
                    System.out.println(Viewer.INPUT_ERROR);
            }
        }
    }
}
