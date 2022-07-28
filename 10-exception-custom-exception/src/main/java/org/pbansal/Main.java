package org.pbansal;


import org.pbansal.exceptions.InsufficientFundException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
       Account account = new Account();
        try {
            account.withdraw(11);
        } catch (InsufficientFundException e) {
            System.out.println(e.getMessage());
        }
    }
}

// this exercise is to understand the concept of custom exceptions.
// you can create your custom exception in a dedicated exception package.
// In Account class, we have this withdraw method which takes the value that we want to withdraw from the account.
// so we have implemented this logic that if the withdrawal takes place more than the balance left in the account then it should
// give an exception to what we want to custom design.
// So we have created this exception called InsufficientFundException which extends the Exception class and modified the exception message the way we want.
// Remember one more thing, that we are creating custom execution for checked type then we need to extend to the Exception class whereas
// if we are unchecked exception (runtime) then we need to extend them to RunTimeException class.


