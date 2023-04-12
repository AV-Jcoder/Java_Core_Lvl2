package org.example.part_6_Generics.lesson27;

public class GenericList<T> {

    private T[] object;
    private int size;

    public GenericList(int initialSize) {
        this.object = (T[]) new Object[initialSize];
    }

    public void add(T element) {
        object[size++] = element;
    }

    public T get(int index) {
        return object[index];
    }

    public int getSize() {
        return size;
    }
}
