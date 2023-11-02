package ru.mirea.lab17.task2;

import java.util.ArrayList;
import java.util.Objects;

public class LabClass {
    private ArrayList<Student> studentList = new ArrayList<>();

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(String name, int iD, float avMark){
        studentList.add(new Student(name, iD, avMark));
    }

    public Student indexOfStudentByName(String name){
        for (int i = 0; i < studentList.size(); i++) {
            if (Objects.equals(studentList.get(i).getName(), name)) return studentList.get(i);
        }
        throw new StudentNotFoundException("Student not Found!", new RuntimeException());
    }

    public Student indexOfStudentByiD(int iD){
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getiD()==iD){
                if (studentList.get(i).getName()=="") throw new EmptyStringException("Empty String Exception", new RuntimeException());
                return studentList.get(i);
            }
        }
        throw new StudentNotFoundException("Student not Found!", new RuntimeException());
    }
}
