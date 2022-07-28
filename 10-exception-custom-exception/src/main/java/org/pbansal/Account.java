package org.pbansal;

import org.pbansal.exceptions.InsufficientFundException;

import java.io.IOException;

public class Account {

    private float balance;

    public void deposit(float value){
        if (value<=0)
            throw new IllegalArgumentException();
    }

    public void withdraw(float value) throws InsufficientFundException {
        if (value > balance)
            throw new InsufficientFundException();
    }


}

