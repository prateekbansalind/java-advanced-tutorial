package org.pbansal;

import jdk.jshell.execution.Util;
import org.pbansal.generics.GenericList;
import org.pbansal.generics.GenericListNumber;
import org.pbansal.generics.KeyValueUtils;
import org.pbansal.generics.Utils;

public class Main {
    public static void main(String[] args) {
        new KeyValueUtils<>("Height", 169).print();
        new KeyValueUtils<>("Value", true).print();

    }
}

// This exercise introduce the concept of multi parameter generics.
// The implemented code is in KeyValueUtils class in the generics.
