package org.pbansal.generics;

import org.pbansal.User;

public class Utils {
    public static <T extends Comparable<T>> T max(T number_a, T number_b){
        return (number_a.compareTo(number_b) > 0) ? number_a : number_b;
    }

    public static <K, V> void print(K key, V value){
        System.out.println(key + " = " + value);
    }

    public static void printUser(User user){
        System.out.println(user);
    }

    // class CAP#1 extends User{}
    // class Instructor extends User
    public static void printUsers
        (GenericList<? super User> users){
        GenericList<Object> temp = new GenericList<>();
        users.add(new Instructor());

    }
}

// first, in the class, we can only implement the generic method with it being static.
// the return type would be <T>.