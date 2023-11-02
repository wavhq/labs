package ru.mirea.lab14;

public class BoundedWaitList<E> extends WaitList{
    private int capacity;

    public BoundedWaitList(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(Object element) {
        if (content.size()<capacity) content.add(element);
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                "capacity=" + capacity +
                '}';
    }
}
