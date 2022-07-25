package org.pbansal;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader reader = new FileReader("abc.text");


    }
}

// Exceptions Hierarchy
// We have Throwable class on the top when it comes to exceptions hierarchy. Above this class we have as usual object class.
// As we all know that every class in Java derives from Object class.
// We have two subclasses of throwable class which are Exception (Checked) and Error class.
// Error class deals with anything which is outside to java program, JVM out of memory or either stack overflow error.
// Exception (Checked) class handles all checked kind of exceptions like the above example code (line no. 8).
// below Exception, we have RuntimeException subclass which handles all unchecked kind of exception.
// e.x. of RunTimeException class exception: https://docs.oracle.com/javase/7/docs/api/java/lang/NullPointerException.html