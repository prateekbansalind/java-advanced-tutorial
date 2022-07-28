package org.pbansal;

import org.pbansal.exceptions.AccountException;
import org.pbansal.exceptions.InsufficientFundException;

import java.io.IOException;

public class Account {

    private float balance;

    public void deposit(float value){
        if (value<=0)
            throw new IllegalArgumentException();
    }

    public void withdraw(float value) throws AccountException {
        if (value > balance)
            var accountException = new AccountException(new InsufficientFundException());
            accountException.initCause(insufficientFundException);
            throw accountException;

    }


}

