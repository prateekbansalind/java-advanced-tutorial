package org.pbansal;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args){

        try (
                var reader = new FileReader("file.txt");
                var writer = new FileWriter("//...");
        ) {
            int value = reader.read();
            // reader.close();
            new SimpleDateFormat().parse("");
            System.out.println("file opened.");
        } catch (IOException | ParseException e){
            System.out.println("could not read data.");
        }
    }
}

// we can give resources related code into try round bracket, so we don't need to explicit give into finally block.