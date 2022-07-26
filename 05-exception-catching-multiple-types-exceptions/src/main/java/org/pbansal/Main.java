package org.pbansal;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args){

        // Block 1
//        try{
//        FileReader reader = new FileReader("file.txt");
//        int value = reader.read();
//        new SimpleDateFormat().parse("");
//        System.out.println("file opened.");
//        } catch(FileNotFoundException ex){
//            System.out.println("file not found");
//            System.out.println(ex.getMessage());
//        } catch (IOException e){
//            System.out.println("could not read data.");
//        } catch (ParseException e){
//            System.out.println("parsing cannot be done.");
//        }

        // Block 2
//                try{
//        FileReader reader = new FileReader("file.txt");
//        int value = reader.read();
//        new SimpleDateFormat().parse("");
//        System.out.println("file opened.");
//        } catch(IOException ex){
//            IOException e = new FileNotFoundException();
//            e.printStackTrace();
//        } catch (ParseException e){
//            System.out.println("parsing cannot be done.");
//        }


        // Block 3
        try{
            FileReader reader = new FileReader("file.txt");
            int value = reader.read();
            new SimpleDateFormat().parse("");
            System.out.println("file opened.");
        } catch (IOException | ParseException e){
            System.out.println("could not read data.");
        }

    }
}

// try and catch block when to handle multiple exceptions.
// If you see line no 16 and line no 19, we can see two exception classes FileNotFoundException and IOException.
// FileNotFoundException class is a child class of IOException, so either using both the class, we can choose to keep the parent class.
// You can see line no 34,
