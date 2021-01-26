package com.hanzoy.SUGWdemoProject.exception;

public class UserAccountPasswordErrorException extends RuntimeException{
    public UserAccountPasswordErrorException(String message){
        super(message);
    }
}
