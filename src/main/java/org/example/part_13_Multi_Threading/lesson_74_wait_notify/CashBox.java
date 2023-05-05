package org.example.part_13_Multi_Threading.lesson_74_wait_notify;

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
