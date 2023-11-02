package ru.mirea.lab11;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSortTest {
    public static void main(String[] args) {

        ArrayList<Student> unsorted = new ArrayList<>();

        String[] names = {"Mike", "Angelle", "Keith", "Derek", "Jack", "Charles", "Victor", "Sam", "Kate", "Maria", "Jess"};
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = -1;


        System.out.print("Enter number of student: ");
        while(true){
            numberOfStudents = sc.nextInt();
            if (numberOfStudents<=0) System.out.println("Error! Number must be more than 0! Try again: ");
            else break;
        }

        for (int i = 0; i<numberOfStudents; i++){
            unsorted.add(new Student(names[(int)(Math.random()* names.length)]));
        }

        System.out.println(unsorted);
        Student.insertionSort(unsorted);
        System.out.println(unsorted);
    }
}
