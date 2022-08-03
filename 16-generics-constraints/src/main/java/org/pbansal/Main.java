package org.pbansal;

import org.pbansal.generics.GenericList;
import org.pbansal.generics.GenericListNumber;

public class Main {
    public static void main(String[] args) {

        // primitive type -> wrapper class of this primitive type
        // int -> Integer
        // float -> Float
        // boolean -> Boolean

     GenericListNumber<Integer> numbers = new GenericListNumber<>();
     numbers.add(1);
     int number = numbers.get(0);
        System.out.println(number);

     GenericList<User> users = new GenericList<>();


    }
}

// this concept of constraint means that we can restrict generics <T> to a specific class type.
// for example if we have created a GenericsListNumber class and want to restrict this class to only perform certain task on numbers than we can use the concept
// where while defining the class we can extend the T to a particular/specific class to create a boundation. For example see the GenericListNumber class in the
// generics package.
// Remember one more thing that all the wrapper class related to numeric kind comes under Number class : https://docs.oracle.com/javase/8/docs/api/java/lang/Number.html

// Another example : if you see GenericList class in the generics package.
// you will see that <T> extends to Comparable and Cloneable Class which restricts GenericList to certain clases.


