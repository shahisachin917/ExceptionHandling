package com.exception.api.exception;

public class CustomIllegalArgumentException extends RuntimeException{
    public CustomIllegalArgumentException(String message){
        super(message);
    }
}
