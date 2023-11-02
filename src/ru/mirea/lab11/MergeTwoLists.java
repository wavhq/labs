package ru.mirea.lab11;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeTwoLists {
    public static void main(String[] args) {
        ArrayList<Student> unsorted1 = new ArrayList<>();
        ArrayList<Student> unsorted2 = new ArrayList<>();
        ArrayList<Student> totalArray = new ArrayList<>();

        String[] names = {"Mike", "Angelle", "Keith", "Derek", "Jack", "Charles", "Victor", "Sam", "Kate", "Maria", "Jess"};
        Scanner sc = new Scanner(System.in);
        int numberOfStudents1 = -1;
        int numberOfStudents2 = -1;

        System.out.print("Enter number of student in the first list: ");
        while(true){
            numberOfStudents1 = sc.nextInt();
            if (numberOfStudents1<=0) System.out.println("Error! Number must be more than 0! Try again: ");
            else break;
        }

        for (int i = 0; i<numberOfStudents1; i++){
            unsorted1.add(new Student(names[(int)(Math.random()* names.length)]));
        }

        System.out.print("Enter number of student in the second list: ");
        while(true){
            numberOfStudents2 = sc.nextInt();
            if (numberOfStudents2<=0) System.out.println("Error! Number must be more than 0! Try again: ");
            else break;
        }

        for (int i = 0; i<numberOfStudents2; i++){
            unsorted2.add(new Student(names[(int)(Math.random()* names.length)]));
        }

        totalArray = unsorted1;
        for (int i = 0; i<unsorted2.size(); i++){
            totalArray.add(unsorted2.get(i));
        }

        System.out.println(totalArray);
        System.out.println(Student.mergeSort(totalArray));
    }
}
