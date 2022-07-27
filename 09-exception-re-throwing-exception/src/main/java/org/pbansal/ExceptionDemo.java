package org.pbansal;

import java.io.IOException;

public class ExceptionDemo {
    public static void show() throws IOException{
        Account account = new Account();
        try {
            account.depositSaving(-1);
        } catch (IOException e) {
            System.out.println("logging");
            throw e;
        }
    }
}
