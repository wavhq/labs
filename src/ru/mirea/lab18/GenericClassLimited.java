package ru.mirea.lab18;

import java.io.Serializable;

public class GenericClassLimited<T , V extends Animal , K>{
    private T type;
    private V value;
    private K key;
    public GenericClassLimited(Comparable T, Serializable V, K key) {
        this.type= (T) T;
        this.value = (V) V;
        this.key = key;
    }

    public T getType() {
        return type;
    }

    public V getValue() {
        return value;
    }

    public K getKey() {
        return key;
    }

    public void printAll(){
        System.out.println(type.getClass());
        System.out.println(value.getClass());
        System.out.println(key.getClass());
    }
}
