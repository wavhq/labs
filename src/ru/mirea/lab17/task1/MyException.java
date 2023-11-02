package ru.mirea.lab17.task1;

public class MyException extends RuntimeException{
    public MyException(String errorMessage, Throwable error){
        super(errorMessage, error);
    }
}
