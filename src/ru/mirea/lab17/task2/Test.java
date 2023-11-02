package ru.mirea.lab17.task2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LabClass model = new LabClass();
        LabClassUI view = new LabClassUI();
        LabClassDriver controller = new LabClassDriver(model, view);
        controller.addStudent("Mike", 199, 4.4f);
        controller.addStudent("Viklz", 201, 3.7f);
        controller.addStudent("Jorg", 214, 1.3f);
        controller.addStudent("", 234, 5.0f);
        while (true){
            System.out.println("Введите номер подпрограммы:\n1. Добавить студента\n2. Найти студента по имени\n3. Найти студента по iD\n4. Вывести список студентов\n5. Выход");
            int choice = 0;

            while (true){
                choice = sc.nextInt();
                if (choice>=1 && choice<=5) break;
                else System.out.println("Ошибка! Введите число от 1 до 5! Повторите ввод: ");
            }

            switch(choice){
                case 1:{
                    String name;
                    int iD;
                    float averageMark;
                    System.out.println("Введите имя студента: ");
                    name = sc.next();
                    if (name=="") throw new EmptyStringException("Empty String Exception", new RuntimeException());
                    System.out.println("Введите iD студента: ");
                    iD = sc.nextInt();
                    System.out.println("Введите среднюю оценку студента: ");
                    averageMark = Float.parseFloat(sc.next());
                    controller.addStudent(name, iD, averageMark);

                } break;
                case 2:{
                    String name;
                    System.out.println("Введите имя студента: ");
                    name = sc.next();
                    if (name=="") throw new EmptyStringException("Empty String Exception", new RuntimeException());
                    System.out.println(controller.indexOfStudentByName(name));
                } break;
                case 3:{
                    int iD;
                    System.out.println("Введите iD студента: ");
                    iD = sc.nextInt();
                    System.out.println(controller.indexOfStudentByiD(iD));
                } break;
                case 4:{
                    controller.updateView();
                } break;
                case 5: return;
                default: break;
            }
        }

    }
}
