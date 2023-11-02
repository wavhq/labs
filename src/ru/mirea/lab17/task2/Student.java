package ru.mirea.lab17.task2;

public class Student {
    private String name;
    private int iD;
    private float averageMark;

    public Student(String name, int iD, float averageMark) {
        this.name = name;
        this.iD = iD;
        this.averageMark = averageMark;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getiD() {
        return iD;
    }
    public void setiD(int iD) {
        this.iD = iD;
    }
    public float getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(float averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", iD: " + iD + ", Mark: " + averageMark;
    }
}
