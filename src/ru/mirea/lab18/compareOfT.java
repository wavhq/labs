package ru.mirea.lab18;

import java.util.Comparator;

public class compareOfT<T> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.toString().compareTo(o2.toString());
    }
}
