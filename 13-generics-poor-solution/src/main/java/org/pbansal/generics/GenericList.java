package org.pbansal.generics;

public class GenericList<T> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item){
        items[count++] = item;
    }

    public T get(int index){
        return items[index];
    }
}

// The code line 4 defines the generics type array of length 10. We cannot directly use "new T[10];" as at runtime java wouldn't understand that what data type is this.
// So we need to user Object and then case it to T.
