package org.pbansal.generics;

import java.util.Iterator;

public class GenericList<T> implements Iterable<T>{
    public T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item){
        items[count++] = item;
    }

    public T getItem(int itemIndex){
        return items[itemIndex];
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
