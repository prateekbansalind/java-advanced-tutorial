package org.pbansal;

import org.pbansal.exceptions.ExceptionDemo;

public class Main {
    public static void main(String[] args) {
        ExceptionDemo.show();

    }
}


// This exercise is to demonstrate exceptions.
// Exception is an object in Java.
// We got this below error because we are implementing toUpperCase method on null string and that's
// why we are getting NullPointerException instance of exception object.
// In java if you see the below errors, you can see that we get the trace of how this error got originated.
// There is an exception handler concept implemented in java which checks each and every line to see if its executes well and if not then there
// should be a mechanism to handle the exception which we will see in coming exercise.


//    Exception in thread "main" java.lang.NullPointerException
//        at org.pbansal.exceptions.ExceptionDemo.sayHello(ExceptionDemo.java:9)
//        at org.pbansal.exceptions.ExceptionDemo.show(ExceptionDemo.java:5)
//        at org.pbansal.Main.main(Main.java:7)