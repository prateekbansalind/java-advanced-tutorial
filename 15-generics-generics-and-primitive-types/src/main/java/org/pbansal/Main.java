package org.pbansal;

import org.pbansal.generics.GenericList;

public class Main {
    public static void main(String[] args) {

        // primitive type -> wrapper class of this primitive type
        // int -> Integer
        // float -> Float
        // boolean -> Boolean

     GenericList<Integer> numbers = new GenericList<>();
     numbers.add(1); // boxing
     int number = numbers.get(0); // unboxing
        System.out.println(number);

    }
}

