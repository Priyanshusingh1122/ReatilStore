package com.stackroute.retail_store.customExceptiom;

/**
 * @author Priyanshu Singh
 */

public class UserNotFoundException extends Exception
{
    public UserNotFoundException(String message)
    {
        super(message);
    }
    public UserNotFoundException()
    {
        super();
    }

}
