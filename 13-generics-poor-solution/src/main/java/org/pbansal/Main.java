package org.pbansal;

import org.pbansal.generics.List;

public class Main {
    public static void main(String[] args) {

        List list = new List();
        list.add(Integer.valueOf(1));
        list.add("1");

        int firstIndexInTheListArray = (int) list.get(1);
        System.out.println(firstIndexInTheListArray);


    }
}

// generics first exercise
// we have created one List class to hold an array of items whose maximum size is 10.
// In this exercise, if we want to create a class specifically to calculate the number of username, it's better to use the concept of generics to minimize the code.
// However, before jumping on the generics concept, let's see the another alternative.
// As we know that all the reference data types in Java inherits from the Object class which is the super class in the whole java.
// Even the primitive type like int, characters, boolean they have their wrapper class implementation to inherit from the object class
// So look the List class in the generics package. We are replacing the form int to instance of Object class.
// the code in the line 12 and 13. we are trying to cast the string value into int which cannot be possible and should be known as an error at to compile time, but
// we don't get to know just by the way we have written this code and this situation where we need generics so that we can catch this kind of error at compile time.
