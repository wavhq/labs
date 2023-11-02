package ru.mirea.lab15.task3;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Employee model = retriveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();

    }
    public static Employee retriveEmployeeFromDatabase(){
        Employee e = new Employee();
        e.setName("Michael");
        e.setSalary(150000);
        return e;
    }
}
