package ru.mirea.lab24;

public class OrderAlreadyAddedException extends RuntimeException {
    public OrderAlreadyAddedException(String errorMessage) {
        super(errorMessage);
    }
}
