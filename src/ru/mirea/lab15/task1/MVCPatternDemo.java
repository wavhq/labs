package ru.mirea.lab15.task1;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController studentController = new StudentController(model, view);
        studentController.updateView();
        studentController.setStudentName("Mike");
        System.out.println("\nUpdated data:\n");
        studentController.updateView();
    }

    public static Student retriveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Jack");
        student.setRollNo("128905R");
        return student;
    }
}
