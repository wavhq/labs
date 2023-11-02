package ru.mirea.lab17.task2;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String errorMessage, Throwable err){
        super(errorMessage, err);
    }
}
