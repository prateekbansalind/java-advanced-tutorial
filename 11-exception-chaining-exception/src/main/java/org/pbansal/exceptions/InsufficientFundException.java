package org.pbansal.exceptions;

// Checked -> Exception
// Unchecked (runtime) -> RunTimeException

public class InsufficientFundException extends Exception{

    public InsufficientFundException() {
        super("Fund is insufficient.");
    }
    public InsufficientFundException(String message) {
        super(message);
    }
}
