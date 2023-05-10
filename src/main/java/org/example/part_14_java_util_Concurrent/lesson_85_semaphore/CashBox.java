package org.example.part_14_java_util_Concurrent.lesson_85_semaphore;

public class CashBox {

    private static int idGenerator = 1;
    private final int id;

    public CashBox() {
        id = idGenerator++;
    }

    @Override
    public String toString() {
        return "CashBox{" +
                "id=" + id +
                '}';
    }
}
