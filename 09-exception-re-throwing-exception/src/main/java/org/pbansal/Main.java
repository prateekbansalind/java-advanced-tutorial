package org.pbansal;


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try{
        ExceptionDemo.show();
        } catch (IOException e){
            System.out.println("An unexpected error has occurred.");
        }
    }
}

// This exercise is to understand the importance of throwing exceptions.
// see the Account class to read the detailed comments.


