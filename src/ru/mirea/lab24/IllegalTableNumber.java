package ru.mirea.lab24;

public class IllegalTableNumber extends RuntimeException {
    public IllegalTableNumber(String errorMessage) {
        super(errorMessage);
    }
}
