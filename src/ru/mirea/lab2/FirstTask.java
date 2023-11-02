package ru.mirea.lab2;

import java.util.Scanner;

public class FirstTask {

    public static void main(String[] args) {
        int[] array;
        int length;
        System.out.println("Enter number of elements in array: ");
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();
        array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter " + (i+1) + " number: ");
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum+=array[i];
        }
        System.out.println("Output with for: " + sum);
        sum = 0;
        int i = 0;
        while (i<array.length){
            sum+=array[i];
            i++;
        }
        System.out.println("Output with while: " + sum);
        sum = 0; i = 0;
        do{
            sum+=array[i];
            i++;
        } while (i<array.length);
        System.out.println("Output with do-while: " + sum);
    }

}
