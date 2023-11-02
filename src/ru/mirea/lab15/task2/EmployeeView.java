package ru.mirea.lab15.task2;

public class EmployeeView {
    public void printEmployeeDetails(Employee e){
        System.out.println("Employee:\nname: " + e.getName() + "\nsalary: " + e.getSalary());
    }
}
