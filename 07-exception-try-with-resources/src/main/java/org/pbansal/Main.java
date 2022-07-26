package org.pbansal;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args){

        FileReader reader = null;
        try{
            reader = new FileReader("file.txt");
            int value = reader.read();
            // reader.close();
            new SimpleDateFormat().parse("");
            System.out.println("file opened.");
        } catch (IOException | ParseException e){
            System.out.println("could not read data.");
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

// the reader.close() in the line 16 may not work if the above line gives exception.
// the IO operations specially something like related to external files are resources handled by operating systems, and they really
// needs to be carefully closed so that other resources can use them in need.
// So, in case if we want to close the file and use this line reader.close() then we can use it in the finally block.
// So, what we can do here is that we can declare reader variable outside the try and catch block.
// Also, we will initiate the reader variable to null as finally block always works irrespective if try and catch block works or not.


