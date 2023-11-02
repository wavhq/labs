package ru.mirea.lab17.task2;

public class EmptyStringException extends RuntimeException{
    public EmptyStringException(String errorMessage, Throwable err){
        super(errorMessage, err);
    }
}
