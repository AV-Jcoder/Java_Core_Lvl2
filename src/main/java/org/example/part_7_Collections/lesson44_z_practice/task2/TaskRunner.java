package org.example.part_7_Collections.lesson44_z_practice.task2;

import org.example.part_7_Collections.lesson44_z_practice.task2.carImpl.*;

/**
 * Задача 2
 *
 * Создать абстрактный класс Car, представляющий собой автомобиль.
 * Добавить в него поля: марка, модель, год выпуска + несколько своих.
 *
 * Создать 4 класса, являющихся наследниками Car.
 * Переопределить во всех 3-х классах методы equals(), hashCode() и toString()
 *
 * Создать класс Garage, хранящий в себе HashMap автомобилей,
 * в котором ключом является объект автомобиля, значением - количество точно таких автомобилей в гараже.
 *
 * Добавить в класс Garage методы для парковки, выезда авто,
 * а также для получения количества определенного вида автомобилей.
 *
 * Продемонстрировать работу гаража.
 */
public class TaskRunner {

    public static void main(String[] args) {
        Car taxi1 = new Taxi("Toyota", "Camry", 2021, 8);
        Car taxi2 = new Taxi("Toyota", "Camry", 2021, 8);
        Car taxi3 = new Taxi("Toyota", "Bibi", 2021, 8);
        Car truck1 = new Truck("Scania", "S100", 2020, 40);
        Car truck2 = new Truck("Scania", "S100", 2020, 40);
        Car truck3 = new Truck("Scania", "S100", 2020, 40);
        Car bus1 = new Bus("PAZ", "Pazic", 2022, 20);
        Car bus2 = new Bus("PAZ", "Pazic", 2022, 20);
        Car bus3 = new Bus("PAZ", "Pazic", 2022, 20);
        Car limuzin1 = new Limyzin("Lincoln", "Navigator", 2023, "A");
        Car limuzin2 = new Limyzin("Lincoln", "Navigator", 2023, "B");
        Car limuzin3 = new Limyzin("Lincoln", "Navigator", 2023, "C");

        Garage garage = new Garage();
        garage.park(taxi1);
        garage.park(taxi2);
        garage.park(taxi3);
        garage.park(truck1);
        garage.park(truck2);
        garage.park(truck3);
        garage.park(bus1);
        garage.park(bus2);
        garage.park(bus3);
        garage.park(limuzin1);
        garage.park(limuzin2);
        garage.park(limuzin3);

        System.out.println("Toyota count: " + garage.getCarCountByBrand("Toyota"));
        System.out.println("Scania count: " + garage.getCarCountByBrand("Scania"));
        System.out.println("Paz count: " + garage.getCarCountByBrand("PAZ"));
        System.out.println("Lincoln count: " + garage.getCarCountByBrand("Lincoln"));

        System.out.println("Camry count: " + garage.getCarCountByModel("Camry"));
        System.out.println("Bibi count: " + garage.getCarCountByModel("Bibi"));
    }
}
