package ru.mirea.lab11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getGPA() > o2.getGPA()) return 1;
        else if (o1.getGPA() < o2.getGPA()) return -1;
        else return 0;
    }

    public static void quickSort(ArrayList<Student> unsorted, int start, int finish){
        if (unsorted.isEmpty() || start>=finish) return;

        int middle = start + ((finish-start)/2);
        int middleGPA = unsorted.get(middle).getGPA();

        int i = start;
        int j = finish;

        while(i<=j){
            while(unsorted.get(i).getGPA()<middleGPA) i++;
            while(unsorted.get(j).getGPA()>middleGPA) j--;
            if(i<=j){
                Student temp = unsorted.get(i);
                unsorted.set(i, unsorted.get(j));
                unsorted.set(j, temp);
                i++;
                j--;
            }
        }

        if (start<j) quickSort(unsorted, start, j);
        if (finish>i) quickSort(unsorted, i, finish);
    }

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
        SortingStudentsByGPA.quickSort(unsorted, 0, unsorted.size()-1);
        System.out.println(unsorted);
    }
}
