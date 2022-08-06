package org.pbansal;

import jdk.jshell.execution.Util;
import org.pbansal.generics.*;

public class Main {
    public static void main(String[] args) {
        var instructors = new GenericList<Instructor>();
        var users = new GenericList<User>();
        Utils.printUsers(users);



    }
}

// This exercise introduce the concept of generic class and inheritance.
