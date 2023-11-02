package ru.mirea.lab21;

import java.util.ArrayList;
import java.util.List;

public class ArrayQueue<T> extends AbstractQueue<T> {
    private int size;
    private int trueNumberOfElement;
    Object[] objects;
    ArrayQueue(int size) {
        this.size = size;
        trueNumberOfElement = 0;
        objects = new Object[size];
    }
    public void enqueue(T t) {
        int i = 0;
        while (objects[i] != null) {
            i++;
        }
        objects[i] = t;
        trueNumberOfElement++;
    }
    public T element() {
        return (T)objects[0];
    }
    public T dequeue() {
        T t = (T)objects[0];
        for (int i = 0; i < trueNumberOfElement - 1; i++) {
            objects[i] = objects[i+1];
        }
        objects[trueNumberOfElement-1] = null;
        trueNumberOfElement--;
        return t;
    }
    public int size() {
        return trueNumberOfElement;
    }
    public boolean isEmpty() {
        if (trueNumberOfElement == 0) {
            return true;
        }
        return false;
    }
    public void clear() {
        int i = 0;
        while (objects[i] != null) {
            objects[i] = null;
            i++;
        }
        trueNumberOfElement = 0;
    }

    @Override
    public String toString() {
        String result = "[ ";
        for (int i = 0; i < trueNumberOfElement; i++) {
            result += objects[i] + " ";
        }
        result += "]";
        return result;
    }

    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>(5);
        queue.enqueue(10);
        queue.enqueue(16);
        queue.enqueue(52);
        queue.enqueue(23);
        queue.enqueue(55);
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.element());
        System.out.println(queue.element());
        System.out.println(queue);
        queue.clear();
        System.out.println(queue);
    }
}