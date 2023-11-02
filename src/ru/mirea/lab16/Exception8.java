package ru.mirea.lab16;

import java.util.Scanner;

public class Exception8 {
    public void getKey(){
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        printDetails(key);

    }

    public void printDetails(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) {
        if (key == "") {
            getKey();
        }
        return "data for " + key;
    }

    public static void main(String[] args){
        Exception8 e = new Exception8();
        e.getKey();
    }
}
