package ru.mirea.lab16;

import java.util.Scanner;

public class Exception4 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero!");
        }
        catch (NumberFormatException e){
            System.out.println("Not an Integer number!");
        }
        finally{
            System.out.println("Программа при любом случае зайдет в этот блок");
        }

    }

    public static void main(String[] args) {
        Exception4 e = new Exception4();
        e.exceptionDemo();
    }
}
