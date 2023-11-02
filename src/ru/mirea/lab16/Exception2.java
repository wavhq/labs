package ru.mirea.lab16;

import java.util.Scanner;

public class Exception2 {
    //Qwerty - NumberFormatException - NaN
    //0 - ArithmeticException - divisionByZero
    //1.2 - NumberFormatException - Not an Integer type
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString); //Если i - Integer, то идем дальше, иначе к блоку на строке 20
            System.out.println(2 / i); //Если i = 0, то к 17 строке, иначе завершение программы
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero!");
        }
        catch (NumberFormatException e){
            System.out.println("Not an Integer number!");
        }

    }

    public static void main(String[] args) {
        Exception2 e = new Exception2();
        e.exceptionDemo();
    }
}
