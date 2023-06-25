package com.stackroute.retail_store.customExceptiom;

/**
 * @author Priyanshu Singh
 */

public class UserAlreadyExistException extends Exception
{
    public UserAlreadyExistException(String message)
    {
        super(message);
    }
    public UserAlreadyExistException()
    {
        super();
    }

}

