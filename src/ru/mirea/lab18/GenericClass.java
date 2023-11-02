package ru.mirea.lab18;

public class GenericClass<T, V, K>{
    private T type;
    private V value;
    private K key;
    public GenericClass(T type, V value, K key) {
        this.type = type;
        this.key = key;
        this.value = value;
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
