package ru.mirea.lab17.task2;

import java.util.ArrayList;

public class LabClassUI {
    public void printStudentList(ArrayList<Student> studentArrayList){
        for (Student s: studentArrayList){
            System.out.println(s);
        }
    }
}
