package ru.mirea.lab19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Solution <T, V, K>{
    private T type;
    private V value;
    private K key;
    public Solution(T type, V value, K key){
        this.type = type;
        this.value = value;
        this.key = key;

    }

    public ArrayList<T> newArrayList(T[] objects){
        ArrayList<T> ar = new ArrayList<T>();
        for (int i = 0; i<objects.length; i++){
            ar.add(objects[i]);
        }
        return ar;
    }

    public HashSet<T> newHashSet(T[] objects){
        HashSet<T> ar = new HashSet<T>();
        for (int i = 0; i<objects.length; i++){
            ar.add(objects[i]);
        }
        return ar;
    }

    public HashMap<K, V> newHashMap(K[] keys, V[] values){
        if (keys.length!= values.length) {
            System.out.println("KEYS array length must be equal to VALUES array length");
            return null;
        }
        HashMap<K, V> ar = new HashMap<K, V>();
        for (int i = 0; i<keys.length; i++){
            ar.put(keys[i], values[i]);
        }
        return ar;
    }
}
