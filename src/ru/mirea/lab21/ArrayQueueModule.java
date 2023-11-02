package ru.mirea.lab21;

import java.util.ArrayList;
import java.util.List;

public class ArrayQueueModule<T> {
    List<T> objects;
    ArrayQueueModule() {
        objects = new ArrayList<>();
    }
    public void enqueue(T t) {
        objects.add(t);
    }
    public T element() {
        try {
            return objects.get(0);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }
    public T dequeue() {
        T result = element();
        objects.remove(0);
        return result;
    }
    public int size() {
        return objects.size();
    }
    public boolean isEmpty() {
        return objects.isEmpty();
    }
    public void clear() {
        objects.clear();
    }

    @Override
    public String toString() {
        return objects.toString();
    }

    public static void main(String[] args) {
        ArrayQueueModule<Integer> queue = new ArrayQueueModule<>();
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
