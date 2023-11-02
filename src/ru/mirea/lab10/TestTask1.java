package ru.mirea.lab10;

import java.util.Scanner;

public class TestTask1 {
    public static void main(String[] args) {
        Task1 test1 = new Task1();
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter last number in sequence: ");
        int last = sc.nextInt();
        test1.triangleSequence(1, last);
    }
}
