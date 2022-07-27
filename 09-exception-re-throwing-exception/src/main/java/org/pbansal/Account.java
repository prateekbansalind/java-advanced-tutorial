package org.pbansal;

import java.io.IOException;

public class Account {
    public void deposit(float value){
        if (value<=0)
            throw new IllegalArgumentException();
    }

    public void depositSaving(float value) throws IOException {
        if (value<=0)
            throw new IOException();
    }
}

// The first method deposit, we are doing a data validation where we do not want to give negative or either zero value, so we need to
// diligently throw the IllegalArgumentException which is an unchecked exception means if it is not handled then our application can crash at run time.
// The second method depositSaving has handled with the checked exception which can be known if not handled properly by compile time.
// We should always try to validate the data if it's coming from outside the application.