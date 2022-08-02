package org.pbansal;

import org.pbansal.generics.GenericList;

public class Main {
    public static void main(String[] args) {

      var list = new GenericList<Integer>();
      list.add(1);
        System.out.println(list.get(0));

      var list_str = new GenericList<String>();
      list_str.add("a");
        System.out.println(list_str.get(0));

    }
}

// This exercise explains the concept of generics
// See the GenericList class for more details