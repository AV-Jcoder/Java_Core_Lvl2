package org.example.part_8_Exceptions.lesson_47_practice;

/** 3.
 * Создать собственный класс-исключение - наследник класса Exception.
 * Создать метод, выбрасывающий это исключение.
 * Вызвать этот метод и отловить исключение. Вывести stack trace в
 * консоль.
 */
public class Task3 {

    public static void main(String[] args) {
        System.out.println("Start main");
        try {
            getMyException();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("End main");
    }

    public static void getMyException() throws MyException {
        throw new MyException();
    }
}

class MyException extends Exception {
    public MyException() {
        super("Exception because.");
    }
}
