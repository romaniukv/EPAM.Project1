package com.epam.project1.view;

import com.epam.project1.model.entities.Toy;

import java.util.List;

public class Viewer {

    public static final String MENU = "-------------------Меню-------------------\n" +
                                      "1. Наполнить игровую комнату игрушками.\n" +
                                      "2. Показать содержимое игровой комнаты.\n" +
                                      "3. Отсортировать игрушки в комнате по цене.\n" +
                                      "4. Найти игрушки в комнате, соответствующие\n" +
                                         "заданному диапазону цены.\n" +
                                      "5. Завершить.\n" +
                                      "------------------------------------------\n";
    public static final String INPUT_GENERAL_PRICE = "Введите общую стоимость игрушек в комнате:";
    public static final String TOTAL_PRICE = "Комнату наполнено игрушками на сумму: ";
    public static final String INPUT_START_PRICE = "Введите начало диапазона:";
    public static final String INPUT_END_PRICE = "Введите конец диапазона:";
    public static final String INPUT_ERROR = "Ошибка ввода!";
    private static final String TOY_LIST = "Список игрушек:";
    private static final String EMPTY_LIST = "Список пуст!";

    public void showToysList(List<Toy> toys) {
        System.out.println(TOY_LIST);
        if (!toys.isEmpty()) {
            for (Toy toy : toys) {
                System.out.println(toy);
            }
        }
        else System.out.println(EMPTY_LIST);
    }

}
