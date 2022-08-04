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

// if you want to see how generics works under the hood.
// then if you first compile the generic class and then click on that class and then click on the view on the taskbar and select "byte code"
// generally under the hood <T> is replaced by Object and if <T> extends to any other classes then under the hood that <T> replaced with the class.
// so basically that concept can be called as type erasure.


