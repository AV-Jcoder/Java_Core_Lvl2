package org.example.part_8_Exceptions.lesson_47_practice;

/**
 *  * 7. Написать метод, который в 50% случаев бросает исключение.
 *  *           Вызвать этот метод в конструкции try-catch-finally. Протестировать
 *  * работу блока finally.
 */
public class Task7 {

    public static void main(String[] args) {
        System.out.println("Main start");
        try {
            getException();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("In finally");
        }
        System.out.println("Main end");
    }

    public static void getException() throws Exception {
        int random = (int) (Math.random()*2);
        switch (random) {
            case 0 : throw new Exception();
            default:
                System.out.println("Program is OK!");
        }
    }
}
