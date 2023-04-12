package org.example.part_6_Generics.lesson27;

public class List {

    private Object[] object;
    private int size;

    public List(int initialSize) {
        this.object = new Object[initialSize];
    }

    public void add(Object element) {
        object[size++] = element;
    }

    public Object get(int index) {
        return object[index];
    }

    public int getSize() {
        return size;
    }
}
