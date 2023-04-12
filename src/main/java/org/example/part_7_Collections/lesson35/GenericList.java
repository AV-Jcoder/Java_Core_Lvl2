package org.example.part_7_Collections.lesson35;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class GenericList<T> implements Iterable<T> {

    private T[] array;
    private int size;

    public GenericList(int initialSize) {
        this.array = (T[]) new Object[initialSize];
    }

    public void add(T element) {
        array[size++] = element;
    }

    public T get(int index) {
        return array[index];
    }

    public int getSize() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new GenericListIterator<>();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }

    class GenericListIterator<T> implements Iterator<T> {

        int lastReturn = -1;
        int curIndex = 0;

        @Override
        public boolean hasNext() {
            return curIndex < size;
        }

        @Override
        public T next() {
            lastReturn = curIndex;
            return (T) array[curIndex++];
        }

        @Override
        public void remove() {
            array[lastReturn] = null;
        }

        @Override
        public void forEachRemaining(Consumer action) {
            Iterator.super.forEachRemaining(action);
        }
    }
}
