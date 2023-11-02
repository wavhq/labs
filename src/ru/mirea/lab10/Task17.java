package ru.mirea.lab10;

import java.util.Scanner;

public class Task17 {
    public int maximum_element(int max){
        Scanner scanner = new Scanner(System.in);
        Integer temp = scanner.nextInt();
        if (temp.equals(0)) return max;

        if (temp>max) return maximum_element(temp);
        else return maximum_element(max);

    }
}
