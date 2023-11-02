package ru.mirea.lab1;

public class Test_Book {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Теория графов", "Роман Игоревич Дзержинский", 2015);

        b2.turnPage();
        System.out.println(b1);
        System.out.println(b2);
    }
}
