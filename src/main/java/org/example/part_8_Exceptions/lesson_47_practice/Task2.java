package org.example.part_8_Exceptions.lesson_47_practice;

/**
 *  * 2. Написать код, который создаст, а затем отловит
 *  * ArrayIndexOutOfBoundsException.
 */
public class Task2 {

    public static void main(String[] args) {
        System.out.println("Main start");
        int[] array = {1,2,3};
        try {
            array[3] = 8;
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        };
        System.out.println("Main end");
    }
}
