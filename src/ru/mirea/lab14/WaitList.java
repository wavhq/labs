package ru.mirea.lab14;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList {
    protected ConcurrentLinkedQueue<E> content;

    public WaitList() {
        this.content = new ConcurrentLinkedQueue<>();
    }

    public WaitList(Collection<E> c) {
        this.content = (ConcurrentLinkedQueue<E>) c;
    }

    @Override
    public void add(Object element) {
        content.add((E) element);
    }

    @Override
    public E remove() {
        return content.remove();
    }

    @Override
    public boolean contains(Object element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }
}
