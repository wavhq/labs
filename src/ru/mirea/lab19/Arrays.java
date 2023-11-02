package ru.mirea.lab19;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Arrays<E>{
    private E[] arrStorage;
    public List<E> convert(E[] array){
        List<E> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++){
            list.add(array[i]);
        }
        return list;
    }

    public E[] getArrStorage() {
        return arrStorage;
    }

    public void setArrStorage(E[] arrStorage) {
        this.arrStorage = arrStorage;
    }

    public E getElement(int index){
        if (index< arrStorage.length){
            return arrStorage[index];
        }
        System.out.println("Index out of bounds!");
        return null;
    }

    public List<String> saver(String filePath){
        BufferedReader br;
        List<String> list = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader(filePath));
            String line = br.readLine();
            while (line != null) {
                list.add(line);
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 5 && i < list.size() ; i++) {
            System.out.println(list.get(i));
        }

        return list;
    }
}
