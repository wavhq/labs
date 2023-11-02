package ru.mirea.lab2;

import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        int[] array;
        int length;
        System.out.println("Enter number of elements in array: ");
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();
        array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random()*100);
        }
        for (int x :
              array) {
            System.out.print(x + " ");
        }
        int j;
        for (int i = 1; i<length; i++) {
            int swap = array[i];
            for (j = i; j>0 && swap<array[j-1]; j--){
                array[j] = array[j-1];
                //unsorted.set(j, unsorted.get(j-1));
            }
            array[j] = swap;
        }
        System.out.println('\n');
        for (int x :
                array) {
            System.out.print(x + " ");
        }
    }
}
