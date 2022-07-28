package org.pbansal.exceptions;

import org.pbansal.ExceptionDemo;

public class AccountException extends Exception{

    public AccountException(Exception cause) {
        super(cause);
    }
}
