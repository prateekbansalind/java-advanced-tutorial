package org.pbansal;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args){
        try{
        FileReader reader = new FileReader("file.txt");
        System.out.println("file opened.");
        } catch(FileNotFoundException ex){
            System.out.println("file not found");
            System.out.println(ex.getMessage());
        }

    }
}

// try and catch is a good way to handle the Compile time exception error.
// In the above example if the error haven't handled properly than the application got crashed with the error message.
// So, in the try block we can write the code that we want to execute and if the code is correct then with no issues the code will get execute otherwise
// the code will throw an NullPointerFoundException object error which can be easily handled using the catch block.
// In the catch block we can give NullPointerFoundException object and then perform appropriate methods on it to properly inform the user about the application.