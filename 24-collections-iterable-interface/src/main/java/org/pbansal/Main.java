package org.pbansal;

import org.pbansal.generics.*;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        GenericList<String> list = new GenericList<>();
        list.add("a");
        list.add("b");
        Iterator<String> item = list.iterator();
        while(item.hasNext()) {
            var i = item.next();
            System.out.println(i);

        }
    }
}

// this exercise is all about iterable interface.
// In our GenericList class, we can implement the iterable<T> interface to this class to easily iterate the items.



