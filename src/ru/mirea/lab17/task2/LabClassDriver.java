package ru.mirea.lab17.task2;

import java.util.Comparator;

public class LabClassDriver {
    private LabClass model;
    private LabClassUI view;

    public LabClassDriver(LabClass model, LabClassUI view){
        this.model = model;
        this.view = view;
    }



    public void addStudent(String name, int iD, float avMark){
        model.addStudent(name, iD, avMark);
    }

    public Student indexOfStudentByName(String name){
        return model.indexOfStudentByName(name);
    }

    public Student indexOfStudentByiD(int iD){
        return model.indexOfStudentByiD(iD);
    }

    public void updateView(){
        model.getStudentList().sort(new ComparatorOfStudents());
        view.printStudentList(model.getStudentList());
    }
}
