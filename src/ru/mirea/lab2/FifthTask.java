package ru.mirea.lab2;

import java.util.Scanner;

public class FifthTask {
    public static int factorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) result = result*i;
        return result;
    }

    public static void main(String[] args) {
        int x;
        System.out.println("Enter any number for factorial: ");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        System.out.println("Factorial of " + x + " is " + FifthTask.factorial(x));
    }
}
