package ru.mirea.lab17.task1;

import java.util.Scanner;

public class MyExceptionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, INN;
        System.out.println("Введите свою фамилию: ");
        name = sc.nextLine();
        System.out.println("Введите свой ИНН: ");
        INN = sc.nextLine();
        if (INN.length()==10){
            try{
                Long.parseLong(INN);
            }
            catch(NumberFormatException e){
                throw new MyException("Not all chars are numbers", e);
            }
        }
        else throw new MyException("Length is not 10", new NumberFormatException());
    }
}
