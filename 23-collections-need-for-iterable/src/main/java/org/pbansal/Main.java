package org.pbansal;

import org.pbansal.generics.*;

public class Main {
    public static void main(String[] args) {

        GenericList<String> list = new GenericList<>();
        list.add("a");
        list.add("b");
        for (var item : list.items){
            System.out.println(item.length());
        }




    }
}

// With this exercise, we are introducing the concept of collections framework.
// Here, we start with understanding iterables.
// if you see the Collections.png file, the green blocks are interface and the green ones are classes which implement this interfaces.
// iterables is a part of Java.lang package.
// The above won't work as we cannot apply for loop to iterate the items for the GenericList, that's where iterable interface comes into play to rescue.


