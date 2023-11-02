package ru.mirea.lab18;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;

public class MinMax<T>{
    ArrayList<T> list;
    public MinMax(ArrayList<T> l){
        list = l;
        list.sort(new compareOfT<>());
    }

    public T minimal(){
        if (list.size()>0) return list.get(0);
       else return null;
    }

    public T maximum(){
        if (list.size()>0) return list.get(list.size()-1);
        else return null;
    }
}
