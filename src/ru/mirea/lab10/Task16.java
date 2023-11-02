package ru.mirea.lab10;

import java.util.Scanner;

public class Task16 {
    public int maximum_count(int max, int counter){
        Scanner scanner = new Scanner(System.in);
        Integer temp = scanner.nextInt();
        if (temp.equals(0)) return counter;

        if (temp>max) return maximum_count(temp, 1);
        else if (temp==max) return maximum_count(temp, counter+1);
        else return maximum_count(max, counter);

    }

}
