package org.pbansal;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader reader = new FileReader("abc.text");


    }
}


// Types of exceptions in java
// There are commonly three types of exceptions in java
// 1. Checked -- Compile time Error
// 2. Unchecked (Runtime error) - Runtime Error
//    a. NullPointerException : when we give null value.
//    b. ArithmeticException : when the number is divided by 0.
//    c. IllegalArgumentException : when we haven't given the correct argument.
//    d. IndexOutOfBoundsException : If they have given the incorrect index in the array.
//    e. IllegalStateException : if the state of any method is not correct.
// 3. Error : error out of the application. E.g. stack overflow error, JVM out of memory

// Usually checked exceptions are compile time error, and we can see the example in this exercise.
// In the line no. 7 if we hover over the FileReader object we can see that the Java compiler gives us a headsup to handle the exception
// in case if the FileReader doesn't get the provided file. e.g. Unhandled exception: java.io.FileNotFoundException
// As a developer, we should always anticipate if our application tends to crash and implement the error handler to contain it to prevent the crash
// and generate the useful message for the user to understand it.