package org.pbansal;

import org.pbansal.generics.GenericList;
import org.pbansal.generics.GenericListNumber;
import org.pbansal.generics.Utils;

public class Main {
    public static void main(String[] args) {

        var res = Utils.max(new User(20), new User(100));
        System.out.println(res);

    }
}

// This exercise introduce the concept of generic methods.
// The generic method code is implemented into Util class inside the generics package.
// you can refer the code in the Util class.