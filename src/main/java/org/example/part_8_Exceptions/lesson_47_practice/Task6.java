package org.example.part_8_Exceptions.lesson_47_practice;

import java.io.FileNotFoundException;
import java.net.ConnectException;
import java.sql.SQLException;

/**
 *  * 6. Создать метод случайным образом выбрасывающий одно из 3-х видов
 *  * исключений.
 *  *           Вызвать этот метод в блоке try-catch, отлавливающем любое из 3-х.
 *  *
 */
public class Task6 {

    public static void main(String[] args) {
        System.out.println("Start main");
        try {
            getRandomException();
        } catch (FileNotFoundException | SQLException | ConnectException e) {
            e.printStackTrace();
        }
        System.out.println("ENd main");
    }

    public static void getRandomException() throws FileNotFoundException, SQLException, ConnectException{
        int random = (int) (Math.random()*3);
        switch (random) {
            case 0 : throw new FileNotFoundException();
            case 1 : throw new SQLException();
            case 2 : throw new ConnectException();
            default: throw new RuntimeException();
        }
    }
}
