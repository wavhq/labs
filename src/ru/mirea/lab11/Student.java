package ru.mirea.lab11;

import java.util.ArrayList;

public class Student implements Comparable<Student>{
    private Integer iDNumber, grade, GPA;
    private String name;
    public Student(String name){
        this.grade = (int) (Math.random()*10 + 1);
        this.iDNumber = (int) (Math.random()*10000000);
        this.name = name;
        this.GPA = (int) (Math.random()*100);
    }
    public Student(int iDNumber, int grade, String name, int GPA){
        this.grade = grade;
        this.iDNumber = iDNumber;
        this.name = name;
        this.GPA = GPA;
    }

    public Integer getiDNumber() {
        return iDNumber;
    }

    public Integer getGPA() {
        return GPA;
    }

    public static void insertionSort(ArrayList<Student> unsorted){
        int j;
        for (int i = 1; i<unsorted.size(); i++) {
            Student swap = unsorted.get(i);
            for (j = i; j>0 && swap.compareTo(unsorted.get(j-1))<0; j--){
                unsorted.set(j, unsorted.get(j-1));
            }
            unsorted.set(j, swap);
        }
    }

    public static ArrayList<Student> mergeArrays(ArrayList<Student> array1, ArrayList<Student> array2) {
        ArrayList<Student> total = new ArrayList<>();
        for (Student student : array1) {
            total.add(student);
        }
        for (Student student : array2) {
            total.add(student);
        }

        int posL = 0;
        int posR = 0;

        for (int i = 0; i < total.size(); i++) {
            if (posL < array1.size() && posR < array2.size()) {
                if (array1.get(posL).getiDNumber() < array2.get(posR).getiDNumber()) {
                    total.set(i, array1.get(posL));
                    posL++;
                }
                else {
                    total.set(i, array2.get(posR));
                    posR++;
                }
            }
            else if (posL == array1.size() && posR < array2.size()) {
                total.set(i, array2.get(posR));
                posR++;
            }
            else if (posL < array1.size() && posR == array2.size()) {
                total.set(i, array1.get(posL));
                posL++;
            }
        }
        return total;
    }

    public static ArrayList<Student> mergeSort(ArrayList<Student> array){
        if (array.isEmpty()) return null;
        if (array.size() < 2) return array;
        ArrayList<Student> array1 = new ArrayList<>();
        ArrayList<Student> array2 = new ArrayList<>();

        int middle = array.size()/2;

        if (array.size()%2==1) middle++;

        for (int i = 0; i < middle; i++){
            array1.add(array.get(i));
        }
        for (int i = middle; i < array.size(); i++){
            array2.add(array.get(i));
        }
        array1 = mergeSort(array1);
        array2 = mergeSort(array2);

        return mergeArrays(array1, array2);
    }

    @Override
    public int compareTo(Student s){
        return this.iDNumber.compareTo(s.iDNumber);
    }

    @Override
    public String toString(){
        return iDNumber + " " + name + " " + grade + " " + GPA;
    }

}
