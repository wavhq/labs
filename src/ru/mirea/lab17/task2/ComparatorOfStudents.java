package ru.mirea.lab17.task2;

import java.util.Comparator;

public class ComparatorOfStudents implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAverageMark() < o2.getAverageMark()) return -1;
        else if (o1.getAverageMark() > o2.getAverageMark()) return 1;
        return 0;
    }
}
