package org.example.part_1_intro.lesson7hard;

import java.util.Arrays;

/**
 * ﻿Задание 1
 *
 * Представить в виде классов и их композиции следующую модель.
 *
 * - Каждый дом содержит свой номер (int), и множество этажей (массив).
 *
 * - Каждый этаж содержит номер этажа (int), и множество квартир (массив).
 *
 * - Каждая квартира содержит свой номер (int), и множество комнат (массив).
 *
 * - Каждая комната содержит поле проходная она или нет (boolean).
 *
 * В каждом классе реализовать метод print, который на консоль выводит информацию об объекте (должны присутствовать все поля объекта!).
 *
 * Например, метод print класса этаж должен выводить на консоль:
 *
 * “Этаж 2, количество квартир 18”
 *
 * Создание всех объектов вынести в отдельный класс с методом main.
 *
 * Там же реализовать метод printAllInformation, который на вход принимает объект типа дом,
 * и выводит информацию о нем, его этажах, квартирах и комнатах, вызывая методы print.
 */
public class Task1 {

    public static void main(String[] args) {
        Room room1 = new Room(false);
        Room room2 = new Room(true);
        Room room3 = new Room(false);
        Room[] rooms1 = {room1, room2, room3};
        Room[] rooms2 = {room1, room2};
        Room[] rooms3 = {room1};
        Apartment apartment1 = new Apartment(1, rooms1);
        Apartment apartment2 = new Apartment(2, rooms2);
        Apartment apartment3 = new Apartment(3,rooms3);
        Apartment[] apartments = {apartment1, apartment2, apartment3};
        Floor floor1 = new Floor(1, apartments);
        Floor floor2 = new Floor(2, apartments);
        Floor floor3 = new Floor(3, apartments);
        Floor[] floors = {floor1, floor2, floor3};
        House house1 = new House(1, floors);
        printAllInformation(house1);
    }

    private static void printAllInformation(House house){
        System.out.println(house);
    }
}

class House {
    private int number;
    private Floor[] floors;

    House(int number, Floor[] floors) {
        this.number = number;
        this.floors = floors;
    }

    public String toString() {
        return "House number: " + number + "\n" + Arrays.toString(floors);
    }
}

class Floor {
    private int number;
    private Apartment[] apartments;

    Floor(int number, Apartment[] apartments) {
        this.number = number;
        this.apartments = apartments;
    }

    public String toString() {
        return "Floor number: " + number + "\n" + Arrays.toString(apartments);
    }
}

class Apartment {
    private int number;
    private Room[] rooms;

    Apartment(int number,Room[] rooms) {
        this.rooms = rooms;
        this.number = number;
    }

    public String toString() {
        return "Apartment: " + number + "\n" + Arrays.toString(rooms);
    }
}

class Room {
    private boolean isCorridor;

    Room(boolean isCorridor) {
        this.isCorridor = isCorridor;
    }

    public String toString() {
        return "Room. This room is corridor? " + isCorridor + "\n";
    }
}