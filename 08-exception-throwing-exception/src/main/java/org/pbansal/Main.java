package org.pbansal;


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Account account = new Account();
        account.deposit(1);
        account.depositSaving(-2);

    }
}

// This exercise is to understand the importance of throwing exceptions.
// see the Account class to read the detailed comments.

